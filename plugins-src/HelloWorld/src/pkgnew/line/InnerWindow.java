/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

import java.awt.Container;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 *
 * @author amine
 */
public interface InnerWindow {
 
    public JTextPane getTextPane();
    public JScrollPane getScrollPane();
    
    public void setTextPane(JTextPane textPane);
    public void setScrollPane(JScrollPane scrollPane);
    
    public void openFile(File file);
    
    public void saveFile() throws Exception;
    
    public void selectFile(File file);
    
    public void saveFile(File file); 
}
