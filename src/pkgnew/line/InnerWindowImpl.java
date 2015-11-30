/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import lib.TextLineNumber;
import plugin.PluginManager;

/**
 *
 * @author amine
 */
public class InnerWindowImpl extends javax.swing.JInternalFrame implements InnerWindow{

    /**
     * Creates new form InnerWindow
     */
    public InnerWindowImpl() {
        initComponents();
        this.setVisible(true);
        this.setMaximizable(true);
        this.setResizable(true);
        this.setClosable(true);
        this.setFocusable(true);
        this.setTitle("New File");
        TextLineNumber tln = new TextLineNumber(textPane);
        scrollPane.setRowHeaderView(tln);
        this.addInternalFrameListener(new InternalFrameAdapter(){
            @Override
            public void internalFrameActivated(InternalFrameEvent e){
                textPane.requestFocusInWindow();
            }
        });
        //PluginManager.getInstance().getPlugin(0).run();
    }
    
    public JTextPane getTextPane(){
        return this.textPane;
    }
    
    
    public void setTextPane(JTextPane textPane){
        this.textPane = textPane;
    }
    
    public InnerWindowImpl(File file){
        this();
        this.openFile(file);
    }
    
    public void openFile(File file){
        try{
            FileReader reader = new FileReader(file);
            selectFile(file);
            this.textPane.read(reader,this);
        }catch(IOException e){
            System.out.println("Could not open "+file.getName());
        }
    }
    
    public void saveFile() throws Exception{
        FileWriter writer = new FileWriter(file);
        this.textPane.write(writer);
        writer.close();
    }
    
    public void selectFile(File file){
        this.file = file;
        this.setTitle(file.getName());
    }
    
    public void saveFile(File file){
        selectFile(file);
        try{
            this.saveFile();
        }catch(Exception e){
            System.out.println("Could not save file!");
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

        scrollPane = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMinimumSize(new java.awt.Dimension(150, 150));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        scrollPane.setViewportView(textPane);

        getContentPane().add(scrollPane);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        WindowFactory winFactory = WindowFactoryImpl.getInstace();
        winFactory.removeWindow(this);
    }//GEN-LAST:event_formInternalFrameClosed

    private File file;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextPane textPane;
    // End of variables declaration//GEN-END:variables
}
