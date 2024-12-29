import javax.swing.*;

import java.awt.*;


public class MancalaTest {
    public static void main(String[] args) {
        MancalaStartMenu menu = new MancalaStartMenu();
        MancalaRuleMenu rules = new MancalaRuleMenu();
        MancalaModel model = new MancalaModel();
        MancalaGameboard board = new MancalaGameboard(model);
        MancalaController controller = new MancalaController(rules, menu, board, model);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // MancalaGameboard board = new MancalaGameboard();
        // rules.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
