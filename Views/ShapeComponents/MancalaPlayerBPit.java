// MancalaPlayerBPit.java
package Views.ShapeComponents;

import java.awt.Graphics2D;

public class MancalaPlayerBPit {
    private int xPosition;
    private int yPosition;
    private BoardStyle boardStyle;

    public MancalaPlayerBPit(BoardStyle style) {
        this.boardStyle = style;
    }

    public void draw(Graphics2D g2) {
        xPosition = 820;
        yPosition = 100;
        int width = 50;
        int height = 200;
        boardStyle.drawMancala(g2, xPosition, yPosition, width, height);
    }
}


