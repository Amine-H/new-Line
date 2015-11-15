/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line.plugin;

import java.util.List;

/**
 *
 * @author amine
 * this Class will manage plugins, it's a Singleton
 */
public class PluginManager {
    private List<Plugin> plugins;
    private static PluginManager pluginManager;
    
    private PluginManager(){}
    private void loadPlugins(){
        //fetch plugins from plugins directory?
    }
    
    public PluginManager getInstance(){
        if(pluginManager == null){
            pluginManager = new PluginManager();
        }
        return pluginManager;
    }
    
    public void addPlugin(Plugin plugin){
        plugins.add(plugin);
    }
    
    public void removePlugin(Plugin plugin){
        plugins.remove(plugin);
    }
}
