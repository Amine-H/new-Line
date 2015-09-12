/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

/**
 *
 * @author amine
 * interface for plugins
 */
public interface Plugin {
    public void run();
    public void suspend();
    public void resume();
}
