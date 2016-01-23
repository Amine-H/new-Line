/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.line;

import java.util.List;

/**
 *
 * @author amine
 * serves as a Creator for InnerWindows,
 * as the Subject of the Observers,
 * it's a Singleton
 */
public interface WindowFactory {
    public InnerWindow createWindow();
    public void removeWindow(InnerWindow window);
    public List<InnerWindow> getWindows();
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
}