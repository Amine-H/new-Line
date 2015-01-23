/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugin;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JScrollPane;
import syntaxhighlight.Parser;
import syntaxhighlight.SyntaxHighlighter;
import syntaxhighlight.SyntaxHighlighterPane;
import syntaxhighlight.Theme;

/**
 *
 * @author amine
 */
public class WindowDecorator extends SyntaxHighlighter {

    //maybe decorate the whole scroll pane ?!
    //contain a SyntaxHilighter(JscrollPane) and use its paint method to actually override the container's paint method!
    private JScrollPane target;

    public WindowDecorator(Parser parser, Theme theme) {
        super(parser, theme);
        SyntaxHighlighterPane highlighterPane = highlighter;
        WindowDecorator highlighter = this;
        highlighterPane.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                try {
                    highlighter.setContent(highlighterPane.getText());
                }catch(Exception exeption){}
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });
    }

    public JScrollPane getTarget() {
        return target;
    }

    //i could not use a constructor as the Decorator states, but it's okey, this will do
    public void setTarget(JScrollPane target) {
        if (this.target == null) {
            this.target = target;
        }
    }
}
