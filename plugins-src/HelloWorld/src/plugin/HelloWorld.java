/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import java.util.Iterator;
import java.util.List;
import pkgnew.line.InnerWindow;
import pkgnew.line.Observer;

/**
 *
 * @author amine
 */
public class HelloWorld implements Plugin,Observer{
    PluginConfiguration pluginConfiguration;
    boolean enabled = true;
    @Override
    public String getName() {
        return "HelloWorld";
    }

    @Override
    public void load(PluginConfiguration conf) {
        this.pluginConfiguration = conf;
        this.run();
    }

    @Override
    public void run() {
        resume();
    }

    @Override
    public void suspend() {
        enabled = false;
        pluginConfiguration.getWindowFactory().removeObserver(this);
    }

    @Override
    public void resume() {
        enabled = true;
        pluginConfiguration.getWindowFactory().registerObserver(this);
        List<InnerWindow> windows = pluginConfiguration.getWindowFactory().getWindows();
        Iterator<InnerWindow> iterator = windows.iterator();
        for(int i =0;iterator.hasNext();i++){
            InnerWindow window = iterator.next();
            window.getTextPane().setText("Hello World!");
        }
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void update() {
        if(enabled){
            resume();
        }
    }
    
}
