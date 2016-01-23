/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author amine
 * this is an implementation of WindowFactory
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
        System.out.println("notifying "+observers.size()+" observers");
        
        ExecutorService executor = Executors.newCachedThreadPool();
        Iterator<Observer> oIterator = observers.iterator();
        while(oIterator.hasNext()){
            Observer o = oIterator.next();
            Runnable task = new Runnable(){
                public void run(){
                    try{
                        Thread.sleep(100);
                    }catch(Exception e){e.printStackTrace();}
                    o.update();
                }
            };
            executor.submit(task);
        }
        executor.shutdown();
    }
    //i don't know what to call this?
    //but it will take care of creating and keep track of created windows
    private List<InnerWindow> windows;
    public InnerWindow createWindow(){
        InnerWindow window = new InnerWindowImpl();
        windows.add(window);
        this.notifyObservers();
        return window;
    }
    public void removeWindow(InnerWindow window){
        windows.remove(window);
    }
    public List<InnerWindow> getWindows(){
        return windows;
    }
}
