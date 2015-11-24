/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JTree;

/**
 *
 * @author amine
 */
public class PluginConfigurationImpl implements PluginConfiguration{
    private JTree tree;
    private JMenuBar toolBar;
    private JDesktopPane desktopPane;

    public JTree getTree() {
        return tree;
    }

    public void setTree(JTree tree) {
        this.tree = tree;
    }

    public JMenuBar getToolBar() {
        return toolBar;
    }

    public void setToolBar(JMenuBar toolBar) {
        this.toolBar = toolBar;
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }
}
