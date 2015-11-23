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
public class PluginConfigurationImpl implements PluginConfiguration{
    private JTree tree;
    private JMenuBar toolBar;
    private JInternalFrame[] internalFrames;

    public JTree getTree() {
        return tree;
    }

    public JMenuBar getToolBar() {
        return toolBar;
    }

    public JInternalFrame[] getInternalFrames() {
        return internalFrames;
    }
}
