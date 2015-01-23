/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

/**
 *
 * @author amine
 * interface for plugins
 */
public interface Plugin {
    public String getName();
    public void load(PluginConfiguration conf);
    public void run();
    public void suspend();
    public void resume();
    public boolean isEnabled();
}
