
package Vista;

import Modelo.AccesoCategoria;
import Modelo.AccesoLibro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Categorias extends javax.swing.JInternalFrame {
    
    AccesoCategoria categoria = new AccesoCategoria();
    DefaultTableModel tm;
    int fila;
    int res = 1;
    int cont=0;
    
    public Categorias() {
        initComponents();
        cargarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtIdCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionCategoria = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Categorías de Libro");

        jLabel2.setText("ID");

        jLabel3.setText("NOMBRE");

        txtDescripcionCategoria.setColumns(20);
        txtDescripcionCategoria.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionCategoria);

        jLabel4.setText("DESCRIPCION");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCategorias);
        if (tblCategorias.getColumnModel().getColumnCount() > 0) {
            tblCategorias.getColumnModel().getColumn(0).setMinWidth(80);
            tblCategorias.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblCategorias.getColumnModel().getColumn(0).setMaxWidth(80);
            tblCategorias.getColumnModel().getColumn(1).setMinWidth(150);
            tblCategorias.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblCategorias.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(70, 70, 70)
                        .addComponent(btnActualizar)
                        .addGap(68, 68, 68)
                        .addComponent(btnEliminar)
                        .addGap(72, 72, 72)
                        .addComponent(btnLimpiar)
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro de ingresar Categoría?");
        if (resp == 0) {
            tm = (DefaultTableModel) tblCategorias.getModel();
        int idCategoria = Integer.parseInt(txtIdCategoria.getText());
        String nombreCategoria = txtNombreCategoria.getText();
        String descripcionCategoria = txtDescripcionCategoria.getText();
        try {
            categoria.ingresarCategoria(idCategoria, nombreCategoria, descripcionCategoria);
            limpiarTabla();
            JOptionPane.showMessageDialog(null, "Ingreado con éxito", "Ingreso Categoría",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
         
        limpiar();
            
        }else{
            JOptionPane.showMessageDialog(null, "No Ingreado", "Ingreso Categoría",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro de actualizar la información de la Categoría?");
        if (resp == 0) {
        int idCategoria = Integer.parseInt(txtIdCategoria.getText());
        tm.setValueAt(idCategoria, fila, 0);
        String nombreCategoria = txtNombreCategoria.getText();
        tm.setValueAt(nombreCategoria, fila, 1);
        String descripcionCategoria = txtDescripcionCategoria.getText();
        tm.setValueAt(descripcionCategoria, fila, 2);
        
        
        tblCategorias.setModel(tm);
        
         try {
            categoria.actualizarCategoria(idCategoria, nombreCategoria, descripcionCategoria);
            tblCategorias.setModel(tm);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Actualizado con éxito", "Actualizar Línea",
                    JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "No Actualizado", "Actualizar Línea",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        tm = (DefaultTableModel) tblCategorias.getModel();
        
        int idCategoria = Integer.parseInt(txtIdCategoria.getText());
        tm.setValueAt(idCategoria, fila, 0);
        
        tblCategorias.setModel(tm);
        
        try {
            categoria.eliminarCategoria(idCategoria);
            tm.removeRow(fila);
            tblCategorias.setModel(tm);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Eliminado con éxito", "Eliminar Categoría",
                    JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriasMouseClicked
        fila = tblCategorias.getSelectedRow();
        tm = (DefaultTableModel) tblCategorias.getModel();
        
        String idCategoria = String.valueOf(tm.getValueAt(fila, 0));
        txtIdCategoria.setText(String.valueOf(idCategoria));
        String nombreCategoria = String.valueOf(tm.getValueAt(fila, 1));
        txtNombreCategoria.setText(nombreCategoria);
        String descripcionCategoria = String.valueOf(tm.getValueAt(fila, 2));
        txtDescripcionCategoria.setText(descripcionCategoria);
    }//GEN-LAST:event_tblCategoriasMouseClicked


    public void limpiarTabla(){
        tm = (DefaultTableModel) tblCategorias.getModel();
        int total = tm.getRowCount();
        for (int i = total -1 ; i >= 0; i--) {
           tm.removeRow(i);
        }
        tblCategorias.setModel(tm);
        cargarTabla();
    }
    
    public void cargarTabla(){
        ResultSet rs = categoria.listarCategoria();
        tm = (DefaultTableModel) tblCategorias.getModel();
        try {
            while (rs.next()) {
                int idCategoria = rs.getInt("idCategoria");
                String nombreCategoria = rs.getString("nombreCategoria");
                String descripcionCategoria = rs.getString("descripcionCategoria");
                
                
                tm.addRow(new Object[]{idCategoria,nombreCategoria,descripcionCategoria});
            }
                tblCategorias.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(Categorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public void limpiar(){
        txtIdCategoria.setText("");
        txtNombreCategoria.setText("");
        txtDescripcionCategoria.setText("");
        fila = -1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextArea txtDescripcionCategoria;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtNombreCategoria;
    // End of variables declaration//GEN-END:variables
}
