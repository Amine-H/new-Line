/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import java.util.Iterator;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import pkgnew.line.InnerWindow;
import pkgnew.line.Observer;
import syntaxhighlighter.SyntaxHighlighterParser;
import syntaxhighlighter.brush.BrushJava;
import syntaxhighlighter.theme.ThemeRDark;

/**
 *
 * @author amine
 */
public class JSyntaxHighlighter implements Plugin, Observer {

    private boolean enabled = true;
    private PluginConfiguration pluginConfiguration;

    @Override
    public String getName() {
        return "JSyntaxHighlighter";
    }

    @Override
    public void load(PluginConfiguration conf) {
        System.out.println("JSyntaxHighlighter, in your Service ^^");
        this.pluginConfiguration = conf;
        //signup as an observer
        this.run();
    }

    @Override
    public void run() {
        this.resume();
        /*
         JInternalFrame[] frames = pluginConfiguration.getDesktopPane().getAllFrames();
         for(JInternalFrame window:frames){
         //((InnerWindow)window).getTextPane().setText("Hello! from JSyntaxHighlighter Plugin");
         InnerWindow inWindow = (InnerWindow)window;
         inWindow.getTextPane().setText("Hello world!");
         }
         */
    }

    @Override
    public void resume() {
        pluginConfiguration.getWindowFactory().registerObserver(this);
        //add plugin's effects
        List<InnerWindow> windows = pluginConfiguration.getWindowFactory().getWindows();
        for (Iterator windowIterator = windows.iterator(); windowIterator.hasNext();) {
            InnerWindow window = (InnerWindow) windowIterator.next();
            this.doDecorate(window);
        }
        enabled = true;
    }

    @Override
    public void suspend() {
        pluginConfiguration.getWindowFactory().removeObserver(this);
        //remove plugin's effects
        List<InnerWindow> windows = pluginConfiguration.getWindowFactory().getWindows();
        for (Iterator windowIterator = windows.iterator(); windowIterator.hasNext();) {
            InnerWindow window = (InnerWindow) windowIterator.next();
            this.undoDecorate(window);
        }
        enabled = false;
    }

    @Override
    public void update() {
        if (enabled) {
            this.resume();
        } else {
            this.suspend();
        }
    }

    private void doDecorate(InnerWindow window) {
        JScrollPane scrollPane = window.getScrollPane();
        if (!(scrollPane instanceof WindowDecorator)) {
            // the SyntaxHighlighter parser
            SyntaxHighlighterParser parser = new SyntaxHighlighterParser(new BrushJava());
            // turn HTML script on
            //parser.setHtmlScript(true);
            // set HTML Script brushes
            //parser.setHTMLScriptBrushes(Arrays.asList(new BrushCss(), new BrushJScript()));
            // besides set, you can also add
            //parser.addHTMLScriptBrush(new BrushJava());
            WindowDecorator decorator = new WindowDecorator(parser, new ThemeRDark());
            //our alternative to Decorator's Constructor
            decorator.setTarget(scrollPane);
            //replace the older scrollpane
            window.setScrollPane(decorator);
            ((JInternalFrame) window).getContentPane().removeAll();
            ((JInternalFrame) window).getContentPane().add(decorator);
            //other stuff
            decorator.setContent(window.getTextPane().getText());
        }
    }

    private void undoDecorate(InnerWindow window) {
        JScrollPane scrollPane = window.getScrollPane();
        if (scrollPane instanceof WindowDecorator) {
            WindowDecorator decorator = (WindowDecorator) scrollPane;
            JScrollPane target = decorator.getTarget();
            try {
                ((JInternalFrame) window).getContentPane().removeAll();
                window.setScrollPane(target);
                ((JInternalFrame) window).getContentPane().add(target);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isEnabled() {
        return enabled;
    }
}
