
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MancalaRuleMenu extends JFrame{
    private final int FRAME_WIDTH = 700;
    private final int FRAME_HEIGHT = 500;
    private JButton backButton = new JButton("Back");

    public MancalaRuleMenu(){
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLayout(new BorderLayout());

        JLabel rulesLabel = new JLabel("Rules");
        rulesLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
        
        String mancalaRules = "<html><br>Objective of the game: Capture the most stones!" + 

        "<html><br>The game board is divided into two rows of six pockets each.<br/>It has two mancalas (one for each player) and "
        + "12 small pockets, each containing either three or four stones.<br/>The player will own the mancala to the right of them."

        + "<br>A player will pick a pocket on THEIR side of the board. <br/>Once picked, " +
        "the stones will move counter-clockwise from the pocket that was picked and will place a stone " +
        "<br/>in each pocket until they run out of stones."

        + "<br>If the last stone lands on a player's mancala, they will get an extra turn." + 
        "<br/>If the last stone ends on a player's empty pocket on their side of the board, <br/>that player gets to capture those stones and the stone(s)" +
        "in the hole directly opposite. <br/>The captured stones go to that player's mancala."

        + "<br>The game ends if one side of the board with no stones in the six pockets. <br/>The other player will deposit their remaining stones into their mancala." +
        "The winner is the player with the most stones.</html>"; 

        JLabel mancalaRulesLabel= new JLabel(mancalaRules);
        textPanel.add(mancalaRulesLabel);
        
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(backButton);

        add(rulesLabel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);

        // setVisible(true);
    }

    public void backButtonListener(ActionListener event){
        backButton.addActionListener(event);
    }

}
