

import java.awt.geom.*;

import javax.swing.JPanel;

import java.awt.*;

public class MancalaStonePanel{
    private int xPosition;
    private int yPosition;
    private Color color;

    public MancalaStonePanel(int x, int y, Color c) {
        xPosition = x;
        yPosition = y;
        color = c;
    }

    public void draw(Graphics2D g2) {
        Ellipse2D circle = new Ellipse2D.Double(xPosition, yPosition, 15, 15);
        g2.setPaint(color);
        g2.fill(circle);
        g2.draw(circle);
    }

    public void move(int x, int y) {
        xPosition = x;
        yPosition = y;
    }
}
