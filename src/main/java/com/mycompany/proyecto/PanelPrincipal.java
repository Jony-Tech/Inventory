package com.mycompany.proyecto;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.vistas.Inventario;
import com.mycompany.vistas.Principal;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PanelPrincipal extends javax.swing.JFrame {

    public PanelPrincipal() {
        initComponents();
        InitContent();
    }
    
    
    private void InitContent() {
        ShowJPanel(new Principal());
    }
    
    public static void ShowJPanel(JPanel p) {
        p.setSize(750, 0);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_prin = new javax.swing.JButton();
        btn_inventario = new javax.swing.JButton();
        btn_returns = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 660));

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(40, 48, 68));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        btn_prin.setBackground(new java.awt.Color(40, 83, 107));
        btn_prin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_prin.setForeground(new java.awt.Color(255, 255, 255));
        btn_prin.setText("Principal");
        btn_prin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_prin.setBorderPainted(false);
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.setIconTextGap(13);
        btn_prin.setInheritsPopupMenu(true);
        btn_prin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prinActionPerformed(evt);
            }
        });

        btn_inventario.setBackground(new java.awt.Color(40, 83, 107));
        btn_inventario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_inventario.setForeground(new java.awt.Color(255, 255, 255));
        btn_inventario.setText("Inventario");
        btn_inventario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_inventario.setBorderPainted(false);
        btn_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_inventario.setIconTextGap(13);
        btn_inventario.setInheritsPopupMenu(true);
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });

        btn_returns.setBackground(new java.awt.Color(40, 83, 107));
        btn_returns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_returns.setForeground(new java.awt.Color(255, 255, 255));
        btn_returns.setText("Reportes");
        btn_returns.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_returns.setBorderPainted(false);
        btn_returns.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_returns.setIconTextGap(13);
        btn_returns.setInheritsPopupMenu(true);
        btn_returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(btn_prin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_returns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(appName)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_prin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btn_returns, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prinActionPerformed
        ShowJPanel(new Principal());
    }//GEN-LAST:event_btn_prinActionPerformed

    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        ShowJPanel(new Inventario());
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_returnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnsActionPerformed
//        ShowJPanel(new Returns());
    }//GEN-LAST:event_btn_returnsActionPerformed

    public static void main(String args[]) {
       FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_inventario;
    private javax.swing.JButton btn_prin;
    private javax.swing.JButton btn_returns;
    private static javax.swing.JPanel content;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
