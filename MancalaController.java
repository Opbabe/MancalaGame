// MancalaController.java
import java.awt.event.*;
import Views.*;
import Views.ShapeComponents.*;

public class MancalaController {
    private MancalaRuleMenu ruleMenu;
    private MancalaStartMenu startMenu;
    private MancalaGameboard board;
    private MancalaModel model;
    private BoardStyle selectedStyle;

    public MancalaController(MancalaRuleMenu ruleMenu, MancalaStartMenu startMenu, MancalaGameboard board, MancalaModel model) {
        this.ruleMenu = ruleMenu;
        this.startMenu = startMenu;
        this.board = board;
        this.model = model;

        startMenu.rulesButtonListener(new RuleButtonListener());
        startMenu.quitButtonListener(new QuitButtonListener());
        startMenu.startButtonListener(new StartButtonListener());
        ruleMenu.backButtonListener(new BackButtonListener());
        startMenu.classicStyleButtonListener(new ClassicStyleButtonListener());
        startMenu.modernStyleButtonListener(new ModernStyleButtonListener());

        selectedStyle = new ClassicStyle(); // Default style
    }

    class RuleButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            startMenu.dispose();
            ruleMenu.setVisible(true);
        }
    }

    class QuitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

    class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            startMenu.dispose();
            board.setBoardStyle(selectedStyle); // Apply the selected style
            board.setVisible(true);
        }
    }

    class BackButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            ruleMenu.dispose();
            startMenu.setVisible(true);
        }
    }

    class ClassicStyleButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            selectedStyle = new ClassicStyle();
            javax.swing.JOptionPane.showMessageDialog(startMenu, "Classic Style Selected");
        }
    }

    class ModernStyleButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            selectedStyle = new ModernStyle();
            javax.swing.JOptionPane.showMessageDialog(startMenu, "Modern Style Selected");
        }
    }
}


