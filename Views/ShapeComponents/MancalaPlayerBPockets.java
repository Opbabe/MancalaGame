// MancalaPlayerBPockets.java
package Views.ShapeComponents;

import java.awt.*;
import java.awt.geom.*;

public class MancalaPlayerBPockets {
    private int xPosition;
    private int yPosition;
    private BoardStyle boardStyle;

    public MancalaPlayerBPockets(BoardStyle style) {
        this.boardStyle = style;
    }

    public void draw(Graphics2D g2) {
        xPosition = 177;
        yPosition = 100;
        int width = 55;
        int height = 95;
        for (int i = 1; i <= 6; i++) {
            int currentX = xPosition;
            int currentY = yPosition;
            boardStyle.drawPit(g2, currentX, currentY, width, height);
            xPosition += 110;
            g2.setFont(new Font("Arial", Font.PLAIN, 16));
            String pocketLabel = "B" + (7 - i);
            g2.drawString(pocketLabel, currentX + width / 2 - 5, currentY - 15);

            // Draw stones (example with one stone)
            int stoneX = currentX + 15;
            int stoneY = currentY + 35;
            int stoneSize = 25;
            boardStyle.drawStone(g2, stoneX, stoneY, stoneSize, Color.BLACK);
        }
    }
}


