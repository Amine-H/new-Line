/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amine
 */
public class WindowFactoryImpl implements WindowFactory{
    //Singleton
    private static WindowFactoryImpl instance;
    private WindowFactoryImpl(){
        windows = new ArrayList<>();
        observers = new ArrayList<>();
    }
    public static WindowFactoryImpl getInstace(){
        if(instance == null){
            instance = new WindowFactoryImpl();
        }
        return instance;
    }
    //Observer
    private List<Observer> observers;
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for(Observer o:observers){
            o.update();
        }
    }
    //i don't know what to call this?
    //but it will take care of creating and keep track of created windows
    private List<InnerWindow> windows;
    public InnerWindow createWindow(){
        InnerWindow window = new InnerWindowImpl();
        windows.add(window);
        return window;
    }
    public void removeWindow(InnerWindow window){
        windows.remove(window);
    }
    public List<InnerWindow> getWindows(){
        return windows;
    }
}
