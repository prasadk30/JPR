package Examples;

import java.applet.Applet;
import java.awt.Graphics;

public class LoopApplet extends Applet {
    public void paint(Graphics g) {
        // Draw a rectangle for loop
        for (int i = 0; i < 5; i++) {
            g.drawRect(20 + i * 30, 20 + i * 10, 30, 30);
        }

        // Draw an oval while loop
        int x = 20;
        int y = 100;
        int width = 30;
        int height = 30;
        int count = 0;
        while (count < 5) {
            g.drawOval(x, y, width, height);
            x += 40;
            count++;
        }
    }
}

