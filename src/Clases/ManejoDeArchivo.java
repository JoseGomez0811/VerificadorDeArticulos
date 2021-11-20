/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class ManejoDeArchivo {
    public String cadena6 = "";
    public String cadena7 = "";
   
    File fichero = new File("test\\texto.txt");
    
    HashTable hash = new HashTable(10111);
    
    public ManejoDeArchivo(){
        
    }
    
//    public void escribirDatosA(String producto2, int stock2){
//       producto = producto2;
//       stock = stock2;
//       
//       try{
//           BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(ficheroA, true)));
//           escribir.write(producto + "," + stock);
//           escribir.write("\n");
//           JOptionPane.showMessageDialog(null, "El producto ha sido guardado exitosamente");
//           escribir.close();
//       }catch (Exception ex){
//           JOptionPane.showMessageDialog(null, ex.getMessage());
//       }
//    }
    
    public void leerDatos(){
        try{
            FileReader fr = new FileReader("test\\texto.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            String cadena2 = "";
            String cadena3 = "";
            String cadena4 = "";
            String cadena5 = "";
            
            while ((cadena = br.readLine()) != null){
                cadena2 += cadena + " ";

            } 
            String[] palabras = cadena2.split(",");
                for (int i = 0; i < palabras.length; i++) {
                    cadena3 += palabras[i];
                }
//            JOptionPane.showMessageDialog(null, cadena3);
            String[] palabras2 = cadena3.split("\\.");
            for (int i = 0; i < palabras2.length; i++) {
                cadena4 += palabras2[i];
            }
//            JOptionPane.showMessageDialog(null, cadena4);
            String[] palabras3 = cadena4.split("\\(");
            for (int i = 0; i < palabras3.length; i++) {
                cadena5 += palabras3[i];
            }
//            JOptionPane.showMessageDialog(null, cadena5);
            String[] palabras4 = cadena5.split("\\)");
            for (int i = 0; i < palabras4.length; i++) {
                //JOptionPane.showMessageDialog(null, palabras[i]);
                cadena6 += palabras4[i];
            }
//            JOptionPane.showMessageDialog(null, cadena6);
            
            
            fr.close();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
