package Examples;

import java.applet.Applet;
import java.awt.Graphics;

public class BasicApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, this is a basic applet!", 20, 20);
    }

}
