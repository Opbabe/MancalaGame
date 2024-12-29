// BoardStyle.java
package Views.ShapeComponents;

import java.awt.Graphics2D;

public interface BoardStyle {
    void drawPit(Graphics2D g2, int x, int y, int width, int height);
    void drawMancala(Graphics2D g2, int x, int y, int width, int height);
    void drawStone(Graphics2D g2, int x, int y, int size, java.awt.Color color);
}


