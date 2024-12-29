
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MancalaGameboard extends JFrame{
    private final int FRAME_WIDTH = 925;
    private final int FRAME_HEIGHT = 550;
    private MancalaModel model;
    private JButton numberStonesButton;
    private JTextField numberStonesField;
    private int numStones;

    public MancalaGameboard(MancalaModel model){
        this.model = model;
        setLayout(new BorderLayout());
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        MancalaBoardDisplay boardDisplay = new MancalaBoardDisplay(model);
        add(boardDisplay, BorderLayout.CENTER);
        
        JPanel boardButtons = new JPanel();
        JButton undoButton = new JButton("Undo Action");
        boardButtons.add(undoButton);
        add(boardButtons, BorderLayout.SOUTH);

        JLabel numberStonesLabel = new JLabel("How many stones for each pit? ");
        numberStonesField = new JTextField(36);
        numberStonesButton = new JButton("Submit");
        numberStonesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String text = numberStonesField.getText();
                System.out.println(text);
                numStones = Integer.parseInt(text);
                for (int i = 0; i < 14; i++) {
                    System.out.println(i);
                    for (int a = 0; a < numStones; a++) {
                        System.out.println(a);
                        model.addStone(new Stone("a", i));
                        model.addStone(new Stone("b", i));
                    }
                }
                System.out.println(model);
                boardDisplay.repaint();
            }
        });
        boardButtons.add(numberStonesLabel);
        boardButtons.add(numberStonesField);
        boardButtons.add(numberStonesButton);

        // setVisible(true);
    }

    // not used yet
    public void numberStoneButtonListener(ActionListener event) {
        numberStonesButton.addActionListener(event);
    }

}
