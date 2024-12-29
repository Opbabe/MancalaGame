// MancalaTest.java
import javax.swing.*;
import Views.MancalaGameboard;
import Views.MancalaRuleMenu;
import Views.MancalaStartMenu;
import Views.ShapeComponents.ClassicStyle;

public class MancalaTest {
    public static void main(String[] args) {
        MancalaStartMenu menu = new MancalaStartMenu();
        MancalaRuleMenu rules = new MancalaRuleMenu();
        MancalaGameboard board = new MancalaGameboard(new ClassicStyle()); // Use ClassicStyle here
        MancalaModel model = new MancalaModel();
        MancalaController controller = new MancalaController(rules, menu, board, model);

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


