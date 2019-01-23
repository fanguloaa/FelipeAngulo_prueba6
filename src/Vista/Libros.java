package Vista;

import Modelo.AccesoCategoria;
import Modelo.AccesoLibro;
import Modelo.ComboBox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Libros extends javax.swing.JInternalFrame {

    ComboBox combo;
    AccesoCategoria categoria = new AccesoCategoria();
    AccesoLibro libro = new AccesoLibro();
    DefaultTableModel tm;
    int fila;
    int res = 1;
    int cont=0;
    
    public Libros() {
        initComponents();
        cargarTabla();
        cargarComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtIdLibro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreLibro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAutorLibro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEjemplares = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbCategorias = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Libros");

        jLabel2.setText("ID");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("AUTOR");

        jLabel5.setText("EDITORIAL");

        jLabel6.setText("EJEMPLARES");

        jLabel7.setText("CATEGORIA");

        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoría..." }));

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

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "AUTOR", "EDITORIAL", "EJEMPLARES", "CATEGORIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLibros);
        if (tblLibros.getColumnModel().getColumnCount() > 0) {
            tblLibros.getColumnModel().getColumn(0).setMinWidth(80);
            tblLibros.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblLibros.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnGuardar)
                                .addGap(77, 77, 77)
                                .addComponent(btnActualizar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreLibro)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 43, Short.MAX_VALUE)
                                .addComponent(btnEliminar)
                                .addGap(97, 97, 97)
                                .addComponent(btnLimpiar)
                                .addGap(99, 99, 99)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro de ingresar Libro?");
        /*String cat;*/
        if (resp == 0) {
            tm = (DefaultTableModel) tblLibros.getModel();
        int idLibro = Integer.parseInt(txtIdLibro.getText());
        String nombreLibro = txtNombreLibro.getText();
        String autorLibro = txtAutorLibro.getText();
        String editorial = txtEditorial.getText();
        int ejemplares = Integer.parseInt(txtEjemplares.getText());
        ComboBox categoria = (ComboBox) cmbCategorias.getSelectedItem();
        try {
            libro.ingresarLibro(idLibro, nombreLibro, autorLibro, editorial,
                    ejemplares,categoria.getIdCategoria());
            limpiarTabla();
            tblLibros.setModel(tm);
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
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro de actualizar la información del Libro?");
        if (resp == 0) {
        
        int idLibro = Integer.parseInt(txtIdLibro.getText());
        tm.setValueAt(idLibro, fila, 0);
        String nombreLibro = txtNombreLibro.getText();
        tm.setValueAt(nombreLibro, fila, 1);
        String autorLibro = txtAutorLibro.getText();
        tm.setValueAt(autorLibro, fila, 2);
        String editorial = txtEditorial.getText();
        tm.setValueAt(editorial, fila, 3);
        int ejemplares = Integer.parseInt(txtEjemplares.getText());
        tm.setValueAt(ejemplares, fila, 4);
        ComboBox categoria = (ComboBox) cmbCategorias.getSelectedItem();
        tm.setValueAt(categoria.getIdCategoria(), fila, 5);
        
        
        
        tblLibros.setModel(tm);
        
         try {
            libro.actualizarLibro(idLibro, nombreLibro, autorLibro, editorial,
                    ejemplares, categoria.getIdCategoria());
            /*tblLibros.setModel(tm);*/
            cargarTabla();
            limpiar();
            limpiarTabla();
            
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Actualizado con éxito", "Actualizar Libro",
                    JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "No Actualizado", "Actualizar Libro",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        tm = (DefaultTableModel) tblLibros.getModel();
        
        int idLibro = Integer.parseInt(txtIdLibro.getText());
        tm.setValueAt(idLibro, fila, 0);
        
        tblLibros.setModel(tm);
        
        try {
            libro.eliminarLibro(idLibro);
            tm.removeRow(fila);
            tblLibros.setModel(tm);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Eliminado con éxito", "Eliminar Libro",
                    JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked
        fila = tblLibros.getSelectedRow();
        tm = (DefaultTableModel) tblLibros.getModel();
        
        String idLibro = String.valueOf(tm.getValueAt(fila, 0));
        txtIdLibro.setText(String.valueOf(idLibro));
        String nombreLibro = String.valueOf(tm.getValueAt(fila, 1));
        txtNombreLibro.setText(nombreLibro);
        String autorLibro = String.valueOf(tm.getValueAt(fila, 2));
        txtAutorLibro.setText(autorLibro);
        String editorial = String.valueOf(tm.getValueAt(fila, 3));
        txtEditorial.setText(editorial);
        String ejemplares = String.valueOf(tm.getValueAt(fila, 4));
        txtEjemplares.setText(ejemplares);
        String categoria = String.valueOf(tm.getValueAt(fila, 5));
        cmbCategorias.setSelectedItem(compararObjeto(categoria));
    }//GEN-LAST:event_tblLibrosMouseClicked


    public void limpiarTabla(){
        tm = (DefaultTableModel) tblLibros.getModel();
        int total = tm.getRowCount();
        for (int i = total -1 ; i >= 0; i--) {
           tm.removeRow(i);
        }
        tblLibros.setModel(tm);
        cargarTabla();
    }
    
    public void cargarTabla(){
        ResultSet rs = libro.listarLibro();
        tm = (DefaultTableModel) tblLibros.getModel();
        try {
            while (rs.next()) {
                int idLibro = rs.getInt("idLibro");
                String nombreLibro = rs.getString("nombreLibro");
                String autorLibro = rs.getString("autorLibro");
                String editorial = rs.getString("editorial");
                int ejemplares = rs.getInt("ejemplares");
                String nombreCategoria  = rs.getString("nombreCategoria");
                
                
                
                tm.addRow(new Object[]{idLibro,nombreLibro,autorLibro,
                    editorial,ejemplares,nombreCategoria});
            }
                tblLibros.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public void limpiar(){
        txtIdLibro.setText("");
        txtNombreLibro.setText("");
        txtAutorLibro.setText("");
        txtEditorial.setText("");
        txtEjemplares.setText("");
        cmbCategorias.setSelectedIndex(0);
        
        fila = -1;
    }
    
    public void cargarComboBox(){
        AccesoCategoria categoria = new AccesoCategoria();
        ResultSet rs = categoria.listarCategoria();
        try {
            while (rs.next()) {
                cmbCategorias.addItem(new ComboBox(rs.getInt("idCategoria"),rs.getString("nombreCategoria")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Libros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ComboBox compararObjeto(String nombreCategoria){
       ComboBox cm = new ComboBox();
       int total = cmbCategorias.getItemCount();
        for (int i = 1; i < total; i++) {
            combo = (ComboBox) cmbCategorias.getItemAt(i);
            if (combo.getNombreCategoria().equals(nombreCategoria)) {
                cm = combo;
            }    
        }
        return cm;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Object> cmbCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEjemplares;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtNombreLibro;
    // End of variables declaration//GEN-END:variables
}
