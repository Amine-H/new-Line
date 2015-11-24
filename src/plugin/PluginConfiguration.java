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
public interface PluginConfiguration {

    public JTree getTree();
    public void setTree(JTree tree);

    public JMenuBar getToolBar();
    public void setToolBar(JMenuBar menuBar);

    public JDesktopPane getDesktopPane();
    public void setDesktopPane(JDesktopPane desktopPane);
}
