// MancalaPlayerAPockets.java
package Views.ShapeComponents;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class MancalaPlayerAPockets {
    private int xPosition;
    private int yPosition;
    private BoardStyle boardStyle;

    public MancalaPlayerAPockets(BoardStyle style) {
        this.boardStyle = style;
    }

    public void draw(Graphics2D g2) {
        xPosition = 180;
        yPosition = 215;
        int width = 55;
        int height = 95;
        for (int i = 1; i <= 6; i++) {
            int currentX = xPosition;
            int currentY = yPosition;
            boardStyle.drawPit(g2, currentX, currentY, width, height);
            xPosition += 110;
            g2.setFont(new Font("Arial", Font.PLAIN, 16));
            String pocketLabel = "A" + (i);
            g2.drawString(pocketLabel, currentX + width / 2 - 5, currentY + height + 15);

            // Draw stones (example with one stone)
            int stoneX = currentX + 15;
            int stoneY = currentY + 35;
            int stoneSize = 25;
            boardStyle.drawStone(g2, stoneX, stoneY, stoneSize, Color.BLACK);
        }
    }
}


