/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.ClsBiblioteca;
import Modelo.ClsLibro;
import Modelo.enumTipoLibro;
import utilidades.Utilidades;

/**
 *
 * @author USUARIO
 */
public class vtnRegistrarLibro extends javax.swing.JFrame {

    private ClsBiblioteca objBiblioteca;
    
    public vtnRegistrarLibro(ClsBiblioteca objBiblioteca) {
        
        initComponents();
        this.objBiblioteca=objBiblioteca;
        this.jLabelErrorNombreLibro.setVisible(false);
        
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelIntermedio = new javax.swing.JPanel();
        jLabelNombreLibro = new javax.swing.JLabel();
        jTextFieldNombreLibro = new javax.swing.JTextField();
        jLabelTipoLibro = new javax.swing.JLabel();
        jComboBoxTipoLibro = new javax.swing.JComboBox<>();
        jLabelErrorNombreLibro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setText("Registro de Libros");
        jPanelSuperior.add(jLabelTitulo);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInferiorLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jButtonRegistrar)
                .addGap(122, 122, 122)
                .addComponent(jButtonCancelar)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonCancelar))
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelIntermedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNombreLibro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNombreLibro.setText("Nombre del Libro");

        jLabelTipoLibro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTipoLibro.setText("Tipo de Libro");

        jComboBoxTipoLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniera", "Fisica", "Quimica", " " }));
        jComboBoxTipoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoLibroActionPerformed(evt);
            }
        });

        jLabelErrorNombreLibro.setForeground(new java.awt.Color(255, 0, 51));
        jLabelErrorNombreLibro.setText("Error");

        javax.swing.GroupLayout jPanelIntermedioLayout = new javax.swing.GroupLayout(jPanelIntermedio);
        jPanelIntermedio.setLayout(jPanelIntermedioLayout);
        jPanelIntermedioLayout.setHorizontalGroup(
            jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntermedioLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreLibro)
                    .addComponent(jLabelTipoLibro))
                .addGap(114, 114, 114)
                .addGroup(jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelErrorNombreLibro)
                    .addGroup(jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldNombreLibro)
                        .addComponent(jComboBoxTipoLibro, 0, 177, Short.MAX_VALUE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanelIntermedioLayout.setVerticalGroup(
            jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntermedioLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreLibro)
                    .addComponent(jTextFieldNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorNombreLibro)
                .addGap(36, 36, 36)
                .addGroup(jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoLibro)
                    .addComponent(jComboBoxTipoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelIntermedio, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
       if (verificarCamposVacios()==true){

            String nombreLibro=this.jTextFieldNombreLibro.getText();
            String TipoLibro=(String) this.jComboBoxTipoLibro.getSelectedItem();
            enumTipoLibro varTipoLibro=null;
            
            if(TipoLibro.equals("Fisica")){
            
                varTipoLibro=enumTipoLibro.fisica;
            
            
            }
            else if(TipoLibro.equals("Quimica")){
            
                varTipoLibro=enumTipoLibro.quimica;
            
            }
            
            else{
            
                varTipoLibro=enumTipoLibro.ingenieria;
            }
           
             boolean bandera=this.objBiblioteca.componerBiblioteca_Libro(nombreLibro, varTipoLibro);

            if(bandera==true){

                        
                        Utilidades.mensajeExito("Registro de libro exitoso", "Registro exitoso");
                       
                        borrarCampos();
            }
            else {

                        Utilidades.mensajeError("Error al registrar Libro", "Libro no registrado");
                        
            }
        
        }
       else
       {
           
             Utilidades.mensajeAdvertencia("Error, hay campos obligatorios sin llenar", "Error en el registro");
               
               
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    
    private boolean verificarCamposVacios(){
    
        
        //True=campos correctos
        boolean bandera=true;
        if(this.jTextFieldNombreLibro.getText().equals("")){
        
        
            this.jLabelErrorNombreLibro.setText("Error,Campo obligatorio");
            this.jLabelErrorNombreLibro.setVisible(true);
        
            bandera=false;
        }
        else{
        
            this.jLabelErrorNombreLibro.setVisible(false);
        
        }
        
        return bandera;
    }
    
    
    private void borrarCampos(){
    
        this.jTextFieldNombreLibro.setText("");
    
    
    }
    
    
    private void jComboBoxTipoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoLibroActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxTipoLibro;
    private javax.swing.JLabel jLabelErrorNombreLibro;
    private javax.swing.JLabel jLabelNombreLibro;
    private javax.swing.JLabel jLabelTipoLibro;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelIntermedio;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldNombreLibro;
    // End of variables declaration//GEN-END:variables
}
