
import java.awt.*;
import java.awt.geom.*;

public class MancalaPlayerAPit {
    private int xPosition;
    private int yPosition;
    private MancalaModel model;

    public MancalaPlayerAPit(MancalaModel model) {
        this.model = model;
    }

    public void draw(Graphics2D g2){
        xPosition = 80;
        yPosition = 100;
        RoundRectangle2D.Double player1Pit = new RoundRectangle2D.Double(xPosition, yPosition, 50, 200, 40, 25);
        int slightMove = 0;
        for (int a = 0; a < model.numStones(); a++) {
            if (model.getStone(a).getPocket() == 0 && model.getStone(a).getPlayer().equals("a")) {
                MancalaStonePanel stone = new MancalaStonePanel(xPosition+slightMove, yPosition+10+slightMove, Color.BLACK);
                slightMove += 15;
                a++;
                stone.draw(g2);
            }
        }

        g2.draw(player1Pit);
    }
}
