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
    public String cadenaAuxiliar = "";
    private String cadena;
    public String cadena2 = "";
    private String cadena3 = "";
    private String cadena4 = "";
    private String cadena5 = "";
    private String cadena6 = ""; 
    private String cadena7 = "";
    private String cadena8 = "";
    private String cadena9 = "";
    private String cadena10 = "";
    File fichero = new File("test\\texto.txt");
    public File masterData;
    
    public ManejoDeArchivo(File masterData){
        this.masterData = masterData;
    }
    
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
        File file = this.masterData;
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            while ((cadena = br.readLine()) != null){
                cadena2 += cadena + " ";

            } 
            
            if(cadena2.contains(",")){
               String[] palabras = cadena2.split(",");
                for (int i = 0; i < palabras.length; i++) {
                    cadena3 += palabras[i];
                }
            cadenaAuxiliar = cadena3;
            }
            
            if(cadena3.contains(".")){
                String[] palabras = cadena3.split("\\.");
                for (int i = 0; i < palabras.length; i++) {
                    cadena4 += palabras[i];
                } 
            cadenaAuxiliar = cadena4;
            }
            
            if(cadena4.contains("(")){
                String[] palabras = cadena4.split("\\(");
                for (int i = 0; i < palabras.length; i++) {
                    cadena5 += palabras[i];
                }
            cadenaAuxiliar = cadena5;
            }
            
            if(cadena5.contains(")")){
                String[] palabras = cadena5.split("\\)");
                for (int i = 0; i < palabras.length; i++) {
                    cadena6 += palabras[i];
                }
            cadenaAuxiliar = cadena6;
            }
            
            if(cadena6.contains("¿")){
                String[] palabras = cadena6.split("\\¿");
                for (int i = 0; i < palabras.length; i++) {
                    cadena7 += palabras[i];
                }
            cadenaAuxiliar = cadena7;
            }
            
            if(cadena7.contains("?")){
                String[] palabras = cadena7.split("\\?");
                for (int i = 0; i < palabras.length; i++) {
                    cadena8 += palabras[i];
                }
            cadenaAuxiliar = cadena8;
            }
            
            if(cadena8.contains(":")){
                String[] palabras = cadena8.split(":");
                for (int i = 0; i < palabras.length; i++) {
                    cadena9 += palabras[i];
                }
            cadenaAuxiliar = cadena9;
            }
            
            if(cadena9.contains(";")){
                String[] palabras = cadena9.split(";");
                for (int i = 0; i < palabras.length; i++) {
                    cadena10 += palabras[i];
                }
            cadenaAuxiliar = cadena10;
            }
            
            fr.close();
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
