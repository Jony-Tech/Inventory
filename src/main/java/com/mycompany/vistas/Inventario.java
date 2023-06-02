package com.mycompany.vistas;



import com.mycompany.interfaces.DAOinventario;
import com.mycompany.proyecto.DAOInventarioImpl;
import com.mycompany.proyecto.PanelPrincipal;
import javax.swing.table.DefaultTableModel;

public class Inventario extends javax.swing.JPanel {

    public Inventario() {
        initComponents();
        LoadArticulos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        articuloSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Boton = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        editeBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(760, 640));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(760, 640));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(102, 102, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Inventario");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Articulo", "Cantidad", "Precio", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Boton.setBackground(new java.awt.Color(40, 83, 107));
        Boton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Boton.setForeground(new java.awt.Color(255, 255, 255));
        Boton.setText("Registrar");
        Boton.setBorderPainted(false);
        Boton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(40, 83, 107));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Nuevo");
        addBtn.setBorderPainted(false);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editeBtn.setBackground(new java.awt.Color(40, 83, 107));
        editeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editeBtn.setForeground(new java.awt.Color(255, 255, 255));
        editeBtn.setText("Editar");
        editeBtn.setBorderPainted(false);
        editeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editeBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(40, 83, 107));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Eliminar");
        deleteBtn.setBorderPainted(false);
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addGap(536, 536, 536))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addComponent(articuloSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(editeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(articuloSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

    }//GEN-LAST:event_jTable1MousePressed

    private void BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActionPerformed
        try{
            String articuloBuscar = articuloSearch.getText();
         
            DAOinventario dao = new DAOInventarioImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            dao.listar(articuloBuscar).forEach((u) -> model.addRow(new Object[]{u.getCodigo(), u.getArticulo(), u.getCantidad(), u.getPrecio(), u.getCategoria()}));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_BotonActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        PanelPrincipal.ShowJPanel(new RegistrarA());
    }//GEN-LAST:event_addBtnActionPerformed

    private void editeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editeBtnActionPerformed
        if(jTable1.getSelectedRow() > -1){ //validar que si este seleccionando alguna fila
             try {
                int articuloId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0); //obtener el id del usuario seleccionado
                DAOinventario dao = new DAOInventarioImpl();
                PanelPrincipal.ShowJPanel(new RegistrarA(dao.getArticuloId(articuloId)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Tiene que seleccionar un articulo a editar \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editeBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (jTable1.getSelectedRow() > -1) { //validar que si este seleccionando alguna fila
            DAOinventario dao = new DAOInventarioImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for (int i : jTable1.getSelectedRows()) {
                try {
                    dao.eliminar((int) jTable1.getValueAt(i, 0));
                    model.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Tiene que seleccionar un articulo a eliminar \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed
    private void LoadArticulos(){
        try {
            DAOinventario dao = new DAOInventarioImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getCodigo(), u.getArticulo(), u.getCantidad(), u.getPrecio(), u.getCategoria()}));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField articuloSearch;
    private javax.swing.JPanel bg;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editeBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
