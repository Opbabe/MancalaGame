// ModernStyle.java
package Views.ShapeComponents;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class ModernStyle implements BoardStyle {

    @Override
    public void drawPit(Graphics2D g2, int x, int y, int width, int height) {
        g2.setColor(Color.LIGHT_GRAY);
        Rectangle2D.Double pit = new Rectangle2D.Double(x, y, width, height);
        g2.fill(pit);
        g2.setColor(Color.BLACK);
        g2.draw(pit);
    }

    @Override
    public void drawMancala(Graphics2D g2, int x, int y, int width, int height) {
        g2.setColor(Color.GRAY);
        Rectangle2D.Double mancala = new Rectangle2D.Double(x, y, width, height);
        g2.fill(mancala);
        g2.setColor(Color.BLACK);
        g2.draw(mancala);
    }

    @Override
    public void drawStone(Graphics2D g2, int x, int y, int size, Color color) {
        g2.setColor(color);
        Rectangle2D.Double stone = new Rectangle2D.Double(x, y, size, size);
        g2.fill(stone);
        g2.setColor(Color.BLACK);
        g2.draw(stone);
    }
}


