/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.VentanaUsuario;
import java.awt.EventQueue;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        File masterData = cargarMasterData();
//        
//        if(masterData != null){
//            ManejoDeArchivo objeto = new ManejoDeArchivo(masterData);
////            objeto.leerDatos();
//            
//            VentanaUsuario ventana = new VentanaUsuario();
//            EventQueue.invokeLater(new Runnable() {
//                @Override
//                public void run() {
//                    ventana.setVisible(true);
//                    //ventana.addWindowListener(new AdaptadorVentanaInicial());
//                }
//            });
//        } 
        
        VentanaUsuario ventana = new VentanaUsuario();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventana.setVisible(true);
                //ventana.addWindowListener(new AdaptadorVentanaInicial());
            }
        });
    }
    
    public static File cargarMasterData() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de texto (TXT)", "txt"));
        fileChooser.showOpenDialog(null);
        File archivo = fileChooser.getSelectedFile();
        if (archivo != null) {
            return archivo;
        }
    
        JOptionPane.showMessageDialog(null, "Asegúrese de seleccionar un archivo");
        return null;
    }
    
}
