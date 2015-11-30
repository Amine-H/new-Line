/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

import java.io.File;
import javax.swing.JTextPane;

/**
 *
 * @author amine
 */
public interface InnerWindow {
 
    public JTextPane getTextPane();
    
    public void setTextPane(JTextPane textPane);
    
    public void openFile(File file);
    
    public void saveFile() throws Exception;
    
    public void selectFile(File file);
    
    public void saveFile(File file); 
}
