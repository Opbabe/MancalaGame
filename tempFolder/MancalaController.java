import java.awt.event.*;

public class MancalaController {
    private MancalaRuleMenu ruleMenu;
    private MancalaStartMenu startMenu;
    private MancalaGameboard board;
    private MancalaPlayerAPit player1Pit;
    private MancalaPlayerBPit player2Pit;
    private MancalaModel model;

    public MancalaController(MancalaRuleMenu ruleMenu, MancalaStartMenu startMenu, MancalaGameboard board, MancalaModel model){
        this.ruleMenu = ruleMenu;
        this.startMenu = startMenu;
        this.board = board;
        this.model = model;

        startMenu.rulesButtonListener(new RuleButtonListener());
        startMenu.quitButtonListener(new QuitButtonListener());
        startMenu.startButtonListener(new StartButtonListener());
        ruleMenu.backButtonListener(new BackButtonListener());
        board.numberStoneButtonListener(new NumberStoneButtonListener());
    }

    class RuleButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            startMenu.dispose();
            ruleMenu.setVisible(true);
        }
    }

    class QuitButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.exit(0);
        }
    }

    class StartButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            startMenu.dispose();
            board.setVisible(true);
        }
    }

    class BackButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            ruleMenu.dispose();
            startMenu.setVisible(true);
        }
    }

    class NumberStoneButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // todo
            // listener is not connected to controller right now, it is hard coded into the gameboard
        }
    }
}
