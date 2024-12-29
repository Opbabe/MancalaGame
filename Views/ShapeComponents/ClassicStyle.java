// ClassicStyle.java
package Views.ShapeComponents;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class ClassicStyle implements BoardStyle {

    @Override
    public void drawPit(Graphics2D g2, int x, int y, int width, int height) {
        g2.setColor(new Color(205, 133, 63)); // Peru color
        Ellipse2D.Double pit = new Ellipse2D.Double(x, y, width, height);
        g2.fill(pit);
        g2.setColor(Color.BLACK);
        g2.draw(pit);
    }

    @Override
    public void drawMancala(Graphics2D g2, int x, int y, int width, int height) {
        g2.setColor(new Color(160, 82, 45)); // Sienna color
        Ellipse2D.Double mancala = new Ellipse2D.Double(x, y, width, height);
        g2.fill(mancala);
        g2.setColor(Color.BLACK);
        g2.draw(mancala);
    }

    @Override
    public void drawStone(Graphics2D g2, int x, int y, int size, Color color) {
        g2.setColor(color);
        Ellipse2D.Double stone = new Ellipse2D.Double(x, y, size, size);
        g2.fill(stone);
        g2.setColor(Color.BLACK);
        g2.draw(stone);
    }
}


