
package Vista;

import Modelo.ClsBiblioteca;
import Modelo.ClsLibro;
import Modelo.enumTipoLibro;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class vtnListaLibros extends javax.swing.JFrame {

    
    private ClsBiblioteca objBiblioteca;
    
    public vtnListaLibros(ClsBiblioteca objBiblioteca) {
        initComponents();
        this.objBiblioteca=objBiblioteca;
        inicializarTabla();
    }

    private void inicializarTabla(){
    
        DefaultTableModel model= new DefaultTableModel();
        model.addColumn("nombre del libro");
        model.addColumn("Tipo de Libro");
         
        this.jTableLibros.setModel(model);
    
    }
    
    private void llenarTabla(){
    
        DefaultTableModel model=(DefaultTableModel) this.jTableLibros.getModel();
        limpiarTabla();
        ArrayList<ClsLibro> ListaLibros = this.objBiblioteca.getLibros();
        
        for(int i=0; i< ListaLibros.size();i++){
        
            String [] fila={ListaLibros.get(i).getNombreLibro(), ListaLibros.get(i).getTipoLibro()+""};
          
            model.addRow(fila);
           
           
        
        
        }
    
    }
    
    private void limpiarTabla(){
    
        DefaultTableModel model = (DefaultTableModel) this.jTableLibros.getModel();
        int filas=this.jTableLibros.getRowCount();
        
        for(int i=0; filas>i;i++){
        
        
            model.removeRow(0);
            
        
        }
             
    
    }
    
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelListaLibros = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jPanelIntermedio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLibros = new javax.swing.JTable();
        jButtonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelListaLibros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelListaLibros.setText("Lista de Libros");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabelListaLibros)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabelListaLibros)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelIntermedio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTableLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableLibros);

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelIntermedioLayout = new javax.swing.GroupLayout(jPanelIntermedio);
        jPanelIntermedio.setLayout(jPanelIntermedioLayout);
        jPanelIntermedioLayout.setHorizontalGroup(
            jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntermedioLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonActualizar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanelIntermedioLayout.setVerticalGroup(
            jPanelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntermedioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonActualizar)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelIntermedio, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
       llenarTabla();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JLabel jLabelListaLibros;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelIntermedio;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLibros;
    // End of variables declaration//GEN-END:variables
}
