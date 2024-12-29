

import java.awt.geom.*;
import java.awt.*;

public class MancalaPlayerAPockets {
    private int xPosition;
    private int yPosition;
    private MancalaModel model;

    public MancalaPlayerAPockets(MancalaModel model) {
        this.model = model;
    }

    public void draw(Graphics2D g2) {
        xPosition = 180;
        yPosition = 215;
        for(int i = 1; i <= 6; i++){
            Ellipse2D.Double pockets = new Ellipse2D.Double(xPosition, yPosition, 55, 95);
            xPosition += 110;
            g2.draw(pockets);
            g2.setFont(new Font("Arial", Font.PLAIN, 16));
            String pocketLabel = "A" + (i);
            g2.drawString(pocketLabel, xPosition - 92, yPosition + 120); 
            
            int slightMove = 0;
            for (int a = 0; a < model.numStones(); a++) {
                if (model.getStone(a).getPocket() == i && model.getStone(a).getPlayer().equals("a")) {
                    MancalaStonePanel stone = new MancalaStonePanel(xPosition - 87-slightMove, yPosition+10+slightMove, Color.BLACK);
                    slightMove += 15;
                    a++;
                    stone.draw(g2);
                }
            }
        }
    }
}

/**
 * xPosition = 177;
        yPosition = 100;
        for (int i = 1; i <= 6; i++) {
            Ellipse2D.Double pockets = new Ellipse2D.Double(xPosition, yPosition, 55, 95);
            xPosition += 110;
            g2.draw(pockets);
 */