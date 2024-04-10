package Examples;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ShapesDrawing extends Applet {
    public void paint(Graphics g) {
        // Set background color
        setBackground(Color.white);
        
        // Draw cone
        g.setColor(Color.blue);
        g.fillArc(50, 50, 100, 100, 0, -180);
        g.drawLine(50, 100, 100, 200);
        g.drawLine(150, 100, 100, 200);
        
        // Draw cylinder
        g.setColor(Color.green);
        g.fillRect(200, 50, 100, 100);
        g.setColor(Color.white);
        g.fillRect(210, 60, 80, 80);
        g.setColor(Color.green);
        g.fillArc(210, 60, 80, 40, 0, -180);
        g.fillArc(210, 100, 80, 40, 0, 180);
        
        // Draw cube
        g.setColor(Color.red);
        g.fillRect(50, 200, 100, 100);
        g.fillRect(150, 200, 100, 100);
        g.drawLine(50, 200, 150, 200);
        g.drawLine(50, 300, 150, 300);
        g.drawLine(150, 200, 250, 200);
        g.drawLine(150, 300, 250, 300);
        
        // Draw square inside a circle
        g.setColor(Color.orange);
        g.fillRect(200, 200, 100, 100);
        g.setColor(Color.yellow);
        g.fillOval(200, 200, 100, 100);
        
        // Draw circle inside a square
        g.setColor(Color.pink);
        g.fillOval(350, 200, 100, 100);
        g.setColor(Color.cyan);
        g.fillRect(350, 200, 100, 100);
    }
}

