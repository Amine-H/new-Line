/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

/**
 *
 * @author amine
 */
public class PluginDialog extends javax.swing.JDialog {

    /**
     * Creates new form PluginDialog
     */
    public PluginDialog(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        this.setTitle("Plugins");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPlugin = new javax.swing.JButton();
        enablePlugin = new javax.swing.JButton();
        disablePlugin = new javax.swing.JButton();
        uninstallPlugin = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        TablePlugins = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Plugins");
        setMinimumSize(new java.awt.Dimension(420, 326));
        setName("Plugins"); // NOI18N

        addPlugin.setText("Add Plugin..");

        enablePlugin.setText("Enable");
        enablePlugin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enablePluginActionPerformed(evt);
            }
        });

        disablePlugin.setText("Disable");
        disablePlugin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disablePluginActionPerformed(evt);
            }
        });

        uninstallPlugin.setText("Uninstall");

        TablePlugins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Name", "Active"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablePlugins.getTableHeader().setReorderingAllowed(false);
        ScrollPane.setViewportView(TablePlugins);
        if (TablePlugins.getColumnModel().getColumnCount() > 0) {
            TablePlugins.getColumnModel().getColumn(0).setMinWidth(50);
            TablePlugins.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablePlugins.getColumnModel().getColumn(0).setMaxWidth(50);
            TablePlugins.getColumnModel().getColumn(2).setMinWidth(50);
            TablePlugins.getColumnModel().getColumn(2).setPreferredWidth(50);
            TablePlugins.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addPlugin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uninstallPlugin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enablePlugin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disablePlugin)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPlugin)
                    .addComponent(enablePlugin)
                    .addComponent(disablePlugin)
                    .addComponent(uninstallPlugin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enablePluginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enablePluginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enablePluginActionPerformed

    private void disablePluginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disablePluginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disablePluginActionPerformed

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
            java.util.logging.Logger.getLogger(PluginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PluginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PluginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PluginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PluginDialog dialog = new PluginDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTable TablePlugins;
    private javax.swing.JButton addPlugin;
    private javax.swing.JButton disablePlugin;
    private javax.swing.JButton enablePlugin;
    private javax.swing.JButton uninstallPlugin;
    // End of variables declaration//GEN-END:variables
}