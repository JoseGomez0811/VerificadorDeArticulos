/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Clases.HashTable;
import Clases.Main;
import Clases.ManejoDeArchivo;
import Clases.RabinKarp;
import java.awt.Color;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;


/**
 *
 * @author SebasBD
 */
public class VentanaVerificar extends javax.swing.JFrame {
    
    
    /**
     * Creates new form VentanaVefificar
     */
    VentanaUsuario prueba = new VentanaUsuario();
    
    Main main = new Main();
    String texto = "";
    JFrame padre;
    public VentanaVerificar(JFrame padre) {
        initComponents();
        this.padre = padre;
        this.setTitle("Verificador Artículos Code4U");
        this.setLocationRelativeTo(this.padre);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTexto = new javax.swing.JTextArea();
        CampoFragmento = new javax.swing.JTextField();
        BotonVerificar = new javax.swing.JButton();
        BotonCargarArchivo = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verificador de Fragmentos");

        AreaTexto.setColumns(20);
        AreaTexto.setLineWrap(true);
        AreaTexto.setRows(5);
        AreaTexto.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        AreaTexto.setSelectionColor(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(AreaTexto);

        CampoFragmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFragmentoActionPerformed(evt);
            }
        });

        BotonVerificar.setText("Verificar");
        BotonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerificarActionPerformed(evt);
            }
        });

        BotonCargarArchivo.setText("Cargar Archivo");
        BotonCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarArchivoActionPerformed(evt);
            }
        });

        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        jLabel1.setText("Verificador Artículos Code4U");

        jLabel2.setText("Ingrese aquí el fragmento que desea verificar:");

        lblInfo.setText("No se ha cargado nungún archivo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(BotonVolver)
                            .addGap(72, 72, 72)
                            .addComponent(BotonCargarArchivo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonVerificar))
                        .addComponent(CampoFragmento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(CampoFragmento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVolver)
                    .addComponent(BotonCargarArchivo)
                    .addComponent(BotonVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerificarActionPerformed
         // TODO add your handling code here:
        String patron = CampoFragmento.getText();
        if (patron != null && texto != null && !patron.isEmpty() && !texto.isEmpty()) {
            RabinKarp rk = new RabinKarp();
            if(rk.rabin_karp(patron, texto)){
                try {
                    AreaTexto.getHighlighter().removeAllHighlights();
                    lblInfo.setText("Conteo de caracteres: " + texto.length() + " | Se encontró el texto en la posición " + rk. getPosicionEncuentro());
                    AreaTexto.getHighlighter().addHighlight(rk.getPosicionEncuentro(), rk.getPosicionFinal(), new DefaultHighlighter.DefaultHighlightPainter(Color.yellow));
                } catch (BadLocationException ex) {
                    System.out.println(ex.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(this,"No se encontro el fragmento en el texto");
            }
        } else {
            JOptionPane.showMessageDialog(this,"Asegúrese de cargar un texto con el botón \"Cargar Archivo\" y "
                    + "de colocar un patrón válido en el campo apropiado");
        }
    }//GEN-LAST:event_BotonVerificarActionPerformed

    private void CampoFragmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFragmentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFragmentoActionPerformed

    private void BotonCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarArchivoActionPerformed
        // TODO add your handling code here:
        File masterData = main.cargarMasterData();
        if(masterData != null){
            ManejoDeArchivo objeto = new ManejoDeArchivo(masterData);
            objeto.leerDatos();
            texto += objeto.cadena2;
            AreaTexto.setText(texto);
            lblInfo.setText("Conteo de caracteres: " + texto.length());
        }
    }//GEN-LAST:event_BotonCargarArchivoActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
       // TODO add your handling code here:
        padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaTexto;
    private javax.swing.JButton BotonCargarArchivo;
    private javax.swing.JButton BotonVerificar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField CampoFragmento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    // End of variables declaration//GEN-END:variables
}
