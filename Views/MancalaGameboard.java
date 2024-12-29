// MancalaGameboard.java
package Views;

import java.awt.*;
import javax.swing.*;
import Views.ShapeComponents.MancalaBoardDisplay;
import Views.ShapeComponents.BoardStyle;

public class MancalaGameboard extends JFrame {
    private final int FRAME_WIDTH = 925;
    private final int FRAME_HEIGHT = 550;
    private MancalaBoardDisplay boardDisplay;

    public MancalaGameboard(BoardStyle style) {
        setLayout(new BorderLayout());
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Initialize the board display with the selected style
        boardDisplay = new MancalaBoardDisplay(style);
        add(boardDisplay, BorderLayout.CENTER);

        JPanel boardButtons = new JPanel();
        JButton undoButton = new JButton("Undo Action");
        boardButtons.add(undoButton);
        add(boardButtons, BorderLayout.SOUTH);

        JLabel numberStonesLabel = new JLabel("How many stones for each pit? ");
        JTextField numberStonesField = new JTextField(36);
        boardButtons.add(numberStonesLabel);
        boardButtons.add(numberStonesField);
    }

    public void setBoardStyle(BoardStyle style) {
        getContentPane().remove(boardDisplay);
        boardDisplay = new MancalaBoardDisplay(style);
        add(boardDisplay, BorderLayout.CENTER);

        revalidate();
        repaint();
    }
}


