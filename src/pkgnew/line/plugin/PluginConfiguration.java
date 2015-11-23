/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line.plugin;

import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JTree;

/**
 *
 * @author amine
 */
public interface PluginConfiguration {

    public JTree getTree();

    public JMenuBar getToolBar();

    public JInternalFrame[] getInternalFrames();
}
