
import java.awt.geom.*;
import java.awt.*;

public class MancalaPlayerBPit {
    private int xPosition;
    private int yPosition;
    private MancalaModel model;

    public MancalaPlayerBPit(MancalaModel model) {
        this.model = model;
    }

    public void draw(Graphics2D g2){
        xPosition = 820;
        yPosition = 100;

        RoundRectangle2D.Double player1Pit = new RoundRectangle2D.Double(xPosition, yPosition, 50, 200, 40, 25);
        int slightMove = 0;
        for (int a = 0; a < model.numStones(); a++) {
            if (model.getStone(a).getPocket() == 13 && model.getStone(a).getPlayer().equals("b")) {
                MancalaStonePanel stone = new MancalaStonePanel(xPosition+slightMove, yPosition+10+slightMove, Color.WHITE);
                slightMove += 15;
                a++;
                stone.draw(g2);
            }
        }
        g2.draw(player1Pit);

    }
}
