/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import java.io.File;
import java.security.Policy;
import java.util.ArrayList;
import java.util.List;
import org.xeustechnologies.jcl.JarClassLoader;
import org.xeustechnologies.jcl.JclObjectFactory;
import org.xeustechnologies.jcl.proxy.CglibProxyProvider;
import org.xeustechnologies.jcl.proxy.ProxyProviderFactory;

/**
 *
 * @author amine this Class will manage plugins, it's a Singleton
 */
public class PluginManager {

    private List<Plugin> plugins;
    private PluginConfiguration pluginConfiguration;
    private static String pluginsDirectory = "plugins/";
    private static PluginManager pluginManager;

    private PluginManager() {
    }

    public static PluginManager getInstance() {
        if (pluginManager == null) {
            pluginManager = new PluginManager();
        }
        return pluginManager;
    }

    public void loadPlugins() {
        //fetch plugins from plugins directory?
        File directory = new File(pluginsDirectory);
        if (!directory.exists()) {//if not exist create plugin folder
            directory.mkdir();
        }
        plugins = new ArrayList<>();
        Policy.setPolicy(new PluginPolicy());
        System.setSecurityManager(new SecurityManager());
        JarClassLoader jcl = new JarClassLoader();
        ProxyProviderFactory.setDefaultProxyProvider(new CglibProxyProvider());
        JclObjectFactory factory = JclObjectFactory.getInstance(true);

        for (File file : directory.listFiles()) {
            if (!file.isDirectory()) {

                //jcl.getSystemLoader().setOrder(1);
                //jcl.add(file.getAbsolutePath());
                //Plugin plugin = (Plugin) factory.create(jcl, "plugin." + file.getName().replace(".jar", ""));
                //this.addPlugin(plugin);
                Plugin plugin = loadPlugin(file);
                plugin.load(pluginConfiguration);
            }
        }
    }

    public Plugin loadPlugin(File file) {
        JarClassLoader jcl = new JarClassLoader();
        JclObjectFactory factory = JclObjectFactory.getInstance(true);
        jcl.getSystemLoader().setOrder(1);
        jcl.add(file.getAbsolutePath());
        Plugin plugin = (Plugin) factory.create(jcl, "plugin." + file.getName().replace(".jar", ""));
        this.addPlugin(plugin);
        return plugin;
    }

    public void addPlugin(Plugin plugin) {
        plugins.add(plugin);
    }

    public void removePlugin(Plugin plugin) {
        plugins.remove(plugin);
    }

    public List<Plugin> getPlugins() {
        return plugins;
    }

    public PluginConfiguration getPluginConfiguration() {
        return this.pluginConfiguration;
    }

    public void setPluginConfiguration(PluginConfiguration conf) {
        this.pluginConfiguration = conf;
    }
}
