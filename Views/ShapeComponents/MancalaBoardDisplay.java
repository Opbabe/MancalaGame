// MancalaBoardDisplay.java
package Views.ShapeComponents;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class MancalaBoardDisplay extends JPanel {
    private BoardStyle boardStyle;
    private MancalaPlayerAPockets playerAPockets;
    private MancalaPlayerAPit playerAPit;
    private MancalaPlayerBPockets playerBPockets;
    private MancalaPlayerBPit playerBPit;

    public MancalaBoardDisplay(BoardStyle style) {
        this.boardStyle = style;
        setLayout(new BorderLayout());
        JLabel playerALabel = new JLabel("Player A");
        JLabel playerAPitLabel = new JLabel("<html>M<br>a<br>n<br>c<br>a<br>l<br>a<br> B</html>");
        playerAPitLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        playerAPockets = new MancalaPlayerAPockets(style);
        playerAPit = new MancalaPlayerAPit(style);
        add(playerALabel, BorderLayout.SOUTH);
        add(playerAPitLabel, BorderLayout.WEST);
        playerALabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel playerBLabel = new JLabel("Player B");
        JLabel playerBPitLabel = new JLabel("<html>M<br>a<br>n<br>c<br>a<br>l<br>a<br> A</html>");
        playerBPitLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        playerBPockets = new MancalaPlayerBPockets(style);
        playerBPit = new MancalaPlayerBPit(style);
        add(playerBLabel, BorderLayout.NORTH);
        add(playerBPitLabel, BorderLayout.EAST);
        playerBLabel.setHorizontalAlignment(JLabel.CENTER);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure proper painting behavior
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Double boardOutline = new Rectangle2D.Double(62, 30, 820, 400);
        g2.draw(boardOutline);

        playerAPockets.draw(g2);
        playerAPit.draw(g2);
        playerBPockets.draw(g2);
        playerBPit.draw(g2);
    }
}


