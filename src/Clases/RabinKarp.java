/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;

/**
 *
 * @author SebasBD
 */
public class RabinKarp {
    public String output = "";
    
    public boolean rabin_karp(String pat, String txt){        
        int m = pat.length();
        int n = txt.length();
        int q = 128;
        int x = 11;
        int x_m = 1;
        int hash_p = 0;
        int hash_t = 0;
        String iden1 = "[";
        String iden2 = "]";
        String texto = txt;
        boolean retorno = false;
       
        for(int i = 0; i < m-1; i++){
            x_m = (x_m*x)%q;
        }
        for(int i = 0; i < m; i++){
            hash_p = (hash_p*x + pat.charAt(i))%q;
            hash_t = (hash_t*x + txt.charAt(i))%q;   
        }
        for(int i = 0; i < n-m+1; i++){
            if(hash_p == hash_t){
                boolean encontrado = true;
                for(int j = 0; j < m; j++){
                    if(pat.charAt(j) != txt.charAt(i+j)){
                        encontrado = false;
                        break;
                    }
                }
                if(encontrado){
                    retorno = true;
                    output ="El fragmento fue encontrado en la posicion " + i + "\n" + texto.substring(0, i) + iden1 + texto.substring(i,i+m) + iden2 + texto.substring(i+m);
                }
            }
            if(i < n-m){
                hash_t = (x*(hash_t - txt.charAt(i)*x_m) + txt.charAt(i+m))%q;
                if(hash_t <0){
                    hash_t += q;
                }
            }
        }
    return retorno;    
    }
}
