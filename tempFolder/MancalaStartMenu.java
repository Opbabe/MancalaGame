
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MancalaStartMenu extends JFrame{
    private final int FRAME_WIDTH = 700;
    private final int FRAME_HEIGHT = 500;
    private JButton startButton = new JButton("Start");
    private JButton rulesButton = new JButton("Rules");
    private JButton quitButton = new JButton("Quit");

    public MancalaStartMenu(){
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLayout(new BorderLayout());

        // Initializing the buttons
        JPanel buttonsPanelTop = new JPanel();
        JPanel buttonsPanelBottom = new JPanel();
        JPanel buttonsPanelTogether = new JPanel();
        buttonsPanelTop.setLayout(new GridLayout(3, 1, FRAME_HEIGHT/ 100, FRAME_WIDTH / 100));
        buttonsPanelBottom.setLayout(new GridLayout(1, 2, FRAME_HEIGHT / 50, FRAME_WIDTH / 50));
        buttonsPanelTogether.setLayout(new BorderLayout(FRAME_WIDTH / 200, FRAME_HEIGHT / 200));
        int buttonWidth = FRAME_WIDTH / 5;
        int buttonHeight = FRAME_HEIGHT / 10;

        startButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        rulesButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        quitButton.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        // temporary buttons reserved for the strategy patterns we plan to use 
        JButton temp1 = new JButton("temp 1");
        JButton temp2 = new JButton("temp 2");

        buttonsPanelTop.add(startButton);
        buttonsPanelTop.add(rulesButton);
        buttonsPanelTop.add(quitButton);

        buttonsPanelBottom.add(temp1);
        buttonsPanelBottom.add(temp2);

        buttonsPanelTogether.add(buttonsPanelTop, BorderLayout.NORTH);
        buttonsPanelTogether.add(buttonsPanelBottom, BorderLayout.SOUTH);
        add(buttonsPanelTogether, BorderLayout.SOUTH);

        // Initializing the center of the screen to say Mancala
        JLabel mancalaText = new JLabel();
        mancalaText.setText("Mancala");
        mancalaText.setFont(new Font("Sans Serif", Font.PLAIN, 48));
        mancalaText.setHorizontalAlignment(JLabel.CENTER);
        add(mancalaText, BorderLayout.NORTH);

        setVisible(true);
    }

    public void rulesButtonListener(ActionListener event){
        rulesButton.addActionListener(event);
    }

    public void startButtonListener(ActionListener event){
        startButton.addActionListener(event);
    }

    public void quitButtonListener(ActionListener event){
        quitButton.addActionListener(event);
    }
}