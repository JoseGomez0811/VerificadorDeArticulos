/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.HashTable;
import Clases.ListaEnlazada;
import Clases.Main;
import Clases.ManejoDeArchivo;
import Clases.RabinKarp;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class VentanaPrueba extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrueba
     */
    
    Main main = new Main();
    HashTable hash = new HashTable(1011);
//    ManejoDeArchivo objeto = new ManejoDeArchivo();
    
    public VentanaPrueba() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        panelPrincipal = new javax.swing.JPanel();
        campoPalabra = new javax.swing.JTextField();
        panelPreviewFrecuencia = new javax.swing.JSplitPane();
        panelIzquierdo = new javax.swing.JPanel();
        tituloPreview = new javax.swing.JLabel();
        contenedorPreview = new javax.swing.JScrollPane();
        previewTexto = new javax.swing.JTextArea();
        panelDerecho = new javax.swing.JPanel();
        tituloPantalla = new javax.swing.JLabel();
        contenedorPantalla = new javax.swing.JScrollPane();
        pantallaFrecuencia = new javax.swing.JTextArea();
        botonera = new javax.swing.JPanel();
        botonLlenar = new javax.swing.JButton();
        botonVaciar = new javax.swing.JButton();
        botonImprimir = new javax.swing.JButton();
        botonPalabrasMasUsadas = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        botonVerificador = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verificador de Artículos Code4U");

        panelPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        java.awt.GridBagLayout panelPrincipalLayout = new java.awt.GridBagLayout();
        panelPrincipalLayout.columnWidths = new int[] {0, 8, 0};
        panelPrincipalLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0};
        panelPrincipal.setLayout(panelPrincipalLayout);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelPrincipal.add(campoPalabra, gridBagConstraints);

        panelPreviewFrecuencia.setMinimumSize(new java.awt.Dimension(300, 250));
        panelPreviewFrecuencia.setPreferredSize(new java.awt.Dimension(280, 300));

        panelIzquierdo.setMinimumSize(new java.awt.Dimension(150, 200));
        panelIzquierdo.setPreferredSize(new java.awt.Dimension(150, 300));

        tituloPreview.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tituloPreview.setText("Vista previa");
        tituloPreview.setAlignmentX(0.5F);

        contenedorPreview.setPreferredSize(new java.awt.Dimension(200, 100));

        previewTexto.setEditable(false);
        previewTexto.setColumns(20);
        previewTexto.setLineWrap(true);
        previewTexto.setRows(5);
        previewTexto.setToolTipText("");

        javax.swing.GroupLayout contenedorPreviewLayout = new javax.swing.GroupLayout(contenedorPreview.getViewport());
        contenedorPreview.getViewport().setLayout(contenedorPreviewLayout);
        contenedorPreviewLayout.setHorizontalGroup(
            contenedorPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(previewTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        contenedorPreviewLayout.setVerticalGroup(
            contenedorPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(previewTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPreview)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(tituloPreview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPreview, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
        );

        panelPreviewFrecuencia.setLeftComponent(panelIzquierdo);

        panelDerecho.setAlignmentX(0.5F);
        panelDerecho.setMinimumSize(new java.awt.Dimension(150, 200));
        panelDerecho.setPreferredSize(new java.awt.Dimension(200, 300));

        tituloPantalla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tituloPantalla.setLabelFor(previewTexto);
        tituloPantalla.setText("Frecuencia de palabras");

        contenedorPantalla.setPreferredSize(new java.awt.Dimension(200, 100));

        pantallaFrecuencia.setEditable(false);
        pantallaFrecuencia.setColumns(20);
        pantallaFrecuencia.setRows(5);
        contenedorPantalla.setViewportView(pantallaFrecuencia);

        javax.swing.GroupLayout panelDerechoLayout = new javax.swing.GroupLayout(panelDerecho);
        panelDerecho.setLayout(panelDerechoLayout);
        panelDerechoLayout.setHorizontalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
            .addGroup(panelDerechoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPantalla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDerechoLayout.setVerticalGroup(
            panelDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(tituloPantalla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPreviewFrecuencia.setRightComponent(panelDerecho);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelPrincipal.add(panelPreviewFrecuencia, gridBagConstraints);

        botonera.setAlignmentY(0.5F);
        botonera.setLayout(new javax.swing.BoxLayout(botonera, javax.swing.BoxLayout.LINE_AXIS));

        botonLlenar.setText("Llenar Tabla");
        botonLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLlenarActionPerformed(evt);
            }
        });
        botonera.add(botonLlenar);

        botonVaciar.setText("Vaciar");
        botonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarActionPerformed(evt);
            }
        });
        botonera.add(botonVaciar);

        botonImprimir.setText("Imprimir");
        botonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirActionPerformed(evt);
            }
        });
        botonera.add(botonImprimir);

        botonPalabrasMasUsadas.setText("Palabras más usadas");
        botonPalabrasMasUsadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPalabrasMasUsadasActionPerformed(evt);
            }
        });
        botonera.add(botonPalabrasMasUsadas);

        botonVerificador.setText("Verificar Articulo");
        botonVerificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerificadorActionPerformed(evt);
            }
        });
        botonera.add(botonPalabrasMasUsadas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelPrincipal.add(botonera, gridBagConstraints);

        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setText("Verificador Artículos Code4U");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        panelPrincipal.add(titulo, gridBagConstraints);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelPrincipal.add(btnBuscar, gridBagConstraints);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLlenarActionPerformed
        // TODO add your handling code here:
//        String palabra = campoPalabra.getText();
//        
//        hash.insertar(palabra);
        File masterData = main.cargarMasterData();
        
        if(masterData != null){
            ManejoDeArchivo objeto = new ManejoDeArchivo(masterData);
            objeto.leerDatos();
            if (null != objeto.getContenidos()) {
                previewTexto.setText(objeto.getContenidos());
            }
            String[] palabras = objeto.cadenaAuxiliar.split(" ");
            for (int i = 0; i < palabras.length; i++) {
                hash.insertar(palabras[i].toLowerCase());
            }
        }

//        objeto.leerDatos();
//        
//        String[] palabras = objeto.cadenaAuxiliar.split(" ");
//        for (int i = 0; i < palabras.length; i++) {
//            //JOptionPane.showMessageDialog(null, palabras5[i]);
//            hash.insertar(palabras[i].toLowerCase());
//        }
        
    }//GEN-LAST:event_botonLlenarActionPerformed

    private void botonVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVaciarActionPerformed
        // TODO add your handling code here:
        hash.vaciado();
    }//GEN-LAST:event_botonVaciarActionPerformed

    private void botonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirActionPerformed
        // TODO add your handling code here:
//        hash.imprimir();
        this.pantallaFrecuencia.setText(hash.imprimir());
    }//GEN-LAST:event_botonImprimirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String palabra = campoPalabra.getText();
        
        hash.buscar(palabra);
        //        JOptionPane.showMessageDialog(null, hash.buscar(palabra));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void botonPalabrasMasUsadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPalabrasMasUsadasActionPerformed
        ListaEnlazada listaEnlazada = hash.ordenarFrecuencias();
        VentanaLista ventanaLista = new VentanaLista(listaEnlazada);
        ventanaLista.setLocationRelativeTo(this);
        ventanaLista.setVisible(true);
    }//GEN-LAST:event_botonPalabrasMasUsadasActionPerformed

    private void botonVerificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerificadorActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        VentanaVerificar verificador = new VentanaVerificar();
        verificador.setVisible(true);
        
    }//GEN-LAST:event_botonVerificadorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonImprimir;
    private javax.swing.JButton botonLlenar;
    private javax.swing.JButton botonPalabrasMasUsadas;
    private javax.swing.JButton botonVaciar;
    private javax.swing.JPanel botonera;
    private javax.swing.JButton botonVerificador;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField campoPalabra;
    private javax.swing.JScrollPane contenedorPantalla;
    private javax.swing.JScrollPane contenedorPreview;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JPanel panelDerecho;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JSplitPane panelPreviewFrecuencia;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextArea pantallaFrecuencia;
    private javax.swing.JTextArea previewTexto;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloPantalla;
    private javax.swing.JLabel tituloPreview;
    // End of variables declaration//GEN-END:variables
}
