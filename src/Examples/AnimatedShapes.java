package Examples;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AnimatedShapes extends Applet implements Runnable {
    private int x = 50;
    private int y = 50;
    private int radius = 20;
    private int arcWidth = 50;
    private int arcHeight = 100;
    private int[] xPoints = {100, 150, 200, 200, 150};
    private int[] yPoints = {200, 150, 200, 250, 250};

    public void init() {
        setBackground(Color.white);
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            try {
                // Move shapes to create animation
                x += 5;
                y += 5;
                radius += 2;
                arcWidth += 5;
                arcHeight += 5;

                // Repaint the applet window
                repaint();

                // Pause the thread for a short duration to control animation speed
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        // Draw lines and rectangles
        g.setColor(Color.red);
        g.drawLine(20, 20, 100, 100);
        g.setColor(Color.blue);
        g.drawRect(30, 30, 100, 50);

        // Draw circles and ellipses
        g.setColor(Color.green);
        g.drawOval(x, y, radius, radius);
        g.setColor(Color.yellow);
        g.drawOval(150, 150, 100, 50);

        // Draw arcs
        g.setColor(Color.orange);
        g.drawArc(250, 100, arcWidth, arcHeight, 0, 180);

        // Draw polygons
        g.setColor(Color.magenta);
        g.drawPolygon(xPoints, yPoints, xPoints.length);
    }
	
}
