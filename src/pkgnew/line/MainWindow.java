/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

import lib.FileTreeModel;
import plugin.PluginPolicy;
import java.beans.PropertyVetoException;
import java.io.File;
import java.security.Policy;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.tree.TreeModel;
import plugin.PluginConfiguration;
import plugin.PluginConfigurationImpl;
import plugin.PluginManager;

/**
 *
 * @author amine
 * this is the mainWindow, it contains InnerWindows
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     * 
     */
    public MainWindow() {
        initComponents();
        this.setTitle("new Line");
        try {
            PluginManager pManager = PluginManager.getInstance();
            PluginConfiguration conf = new PluginConfigurationImpl();
            conf.setToolBar(menuBar);
            conf.setTree(ProjectTree);
            conf.setDesktopPane(desktopPane);
            pManager.setPluginConfiguration(conf);
            pManager.loadPlugins();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        PT_Panel = new javax.swing.JPanel();
        PT_ScrollPane = new javax.swing.JScrollPane();
        ProjectTree = new javax.swing.JTree();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openFolder = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        newMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        undoMenuItem = new javax.swing.JMenuItem();
        redoMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        pluginsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProjectTree.setModel(new FileTreeModel(new File(".")));
        ProjectTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProjectTreeMouseClicked(evt);
            }
        });
        PT_ScrollPane.setViewportView(ProjectTree);

        javax.swing.GroupLayout PT_PanelLayout = new javax.swing.GroupLayout(PT_Panel);
        PT_Panel.setLayout(PT_PanelLayout);
        PT_PanelLayout.setHorizontalGroup(
            PT_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PT_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        PT_PanelLayout.setVerticalGroup(
            PT_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PT_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );

        SplitPane.setLeftComponent(PT_Panel);
        SplitPane.setRightComponent(desktopPane);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openFolder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        openFolder.setText("Open Folder");
        openFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFolderActionPerformed(evt);
            }
        });
        fileMenu.add(openFolder);
        fileMenu.add(jSeparator2);

        newMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenuItem.setText("New");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newMenuItem);

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        undoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undoMenuItem.setText("Undo");
        undoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(undoMenuItem);

        redoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        redoMenuItem.setText("Redo");
        editMenu.add(redoMenuItem);
        editMenu.add(jSeparator1);

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Settings..");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        pluginsMenuItem.setText("Plugins..");
        pluginsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pluginsMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(pluginsMenuItem);

        aboutMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        aboutMenuItem1.setMnemonic('a');
        aboutMenuItem1.setText("About");
        aboutMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem1);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * closes the editor
     * @param evt unused
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * shows open File Window
     * @param evt unused
     */
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            WindowFactory winFactory = WindowFactoryImpl.getInstace();
            InnerWindowImpl nv = (InnerWindowImpl)winFactory.createWindow();
            nv.openFile(file);
            desktopPane.add(nv);
            try {
                nv.setSelected(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    /**
     * opens settings dialog
     * @param evt unused
     */
    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        //Settings
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    /**
     * shows plugins dialog
     * @param evt unused
     */
    private void pluginsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pluginsMenuItemActionPerformed
        PluginDialog dialog = new PluginDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_pluginsMenuItemActionPerformed

    /**
     * opens new InnerWindow
     * @param evt unused
     */
    private void newMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed
        WindowFactory winFactory = WindowFactoryImpl.getInstace();
        InnerWindowImpl nv = (InnerWindowImpl)winFactory.createWindow();
        desktopPane.add(nv);
        try {
            nv.setSelected(true);
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        PluginManager pManager = PluginManager.getInstance();
    }//GEN-LAST:event_newMenuItemActionPerformed

    /**
     * undo last action
     * @param evt unused
     */
    private void undoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoMenuItemActionPerformed
        if (desktopPane.getSelectedFrame() == null) {
            return;
        }
    }//GEN-LAST:event_undoMenuItemActionPerformed

    /**
     * cut text from editor
     * @param evt unused
     */
    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        if (desktopPane.getSelectedFrame() == null) {
            return;
        }
        ((InnerWindowImpl) desktopPane.getSelectedFrame()).getTextPane().cut();
    }//GEN-LAST:event_cutMenuItemActionPerformed

    /**
     * pasts text into editor
     * @param evt unused
     */
    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        if (desktopPane.getSelectedFrame() == null) {
            return;
        }
        ((InnerWindowImpl) desktopPane.getSelectedFrame()).getTextPane().paste();
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    /**
     * copies text into editor
     * @param evt unused
     */
    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        if (desktopPane.getSelectedFrame() == null) {
            return;
        }
        ((InnerWindowImpl) desktopPane.getSelectedFrame()).getTextPane().copy();
    }//GEN-LAST:event_copyMenuItemActionPerformed

    /**
     * deletes text from editor
     * @param evt unused
     */
    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        if (desktopPane.getSelectedFrame() == null) {
            return;
        }
        JTextPane textPane = ((InnerWindowImpl) desktopPane.getSelectedFrame()).getTextPane();
        try {
            textPane.setText(textPane.getText().replace(textPane.getSelectedText(), ""));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    /**
     * saves text of current active InnerWindow into File
     * @param evt unused
     */
    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        if (desktopPane.getSelectedFrame() == null) {
            return;
        }
        try {
            ((InnerWindowImpl) desktopPane.getSelectedFrame()).saveFile();
        } catch (Exception e) {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                ((InnerWindowImpl) desktopPane.getSelectedFrame()).saveFile(fileChooser.getSelectedFile());
            }
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    /**
     * saves text of current active InnerWindow into File 
     * @param evt unused
     */
    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        if (desktopPane.getSelectedFrame() == null) {
            return;
        }
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            ((InnerWindowImpl) desktopPane.getSelectedFrame()).saveFile(fileChooser.getSelectedFile());
        }
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    /**
     * makes me known :p
     * @param evt unused
     */
    private void aboutMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem1ActionPerformed
        //AboutDialog dialog = new AboutDialog(this,true);
        //dialog.setLocationRelativeTo(null);
        //dialog.setVisible(true);
        AboutDialog.main(null);
    }//GEN-LAST:event_aboutMenuItem1ActionPerformed

    /**
     * show dialog to select folder
     * @param evt unused
     */
    private void openFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFolderActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            TreeModel model = new FileTreeModel(fileChooser.getCurrentDirectory());

            ProjectTree.setModel(model);
            PT_ScrollPane.setViewportView(ProjectTree);
        }
    }//GEN-LAST:event_openFolderActionPerformed

    /**
     * executed every time the ProjectTree is clicked
     * @param evt has informations about the click
     */
    private void ProjectTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectTreeMouseClicked
        Object[] paths = ProjectTree.getSelectionPath().getPath();
        if (evt.getClickCount() == 2) {
            if (paths.length > 0) {
                File fichier = new File(paths[paths.length - 1].toString());
                if (!fichier.isDirectory()) {
                    InnerWindowImpl nv = new InnerWindowImpl(fichier);
                    desktopPane.add(nv);
                    try {
                        nv.setSelected(true);
                    } catch (PropertyVetoException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_ProjectTreeMouseClicked

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //set plugin policy
                Policy.setPolicy(new PluginPolicy());
                System.setSecurityManager(new SecurityManager());
                //instantiate MainWindow and start it
                JFrame window = new MainWindow();
                window.setExtendedState(window.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                window.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PT_Panel;
    private javax.swing.JScrollPane PT_ScrollPane;
    private javax.swing.JTree ProjectTree;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem aboutMenuItem1;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem openFolder;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem pluginsMenuItem;
    private javax.swing.JMenuItem redoMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem undoMenuItem;
    // End of variables declaration//GEN-END:variables

}
