import java.util.ArrayList;

public class MancalaModel {
    private ArrayList<Stone> stones;

    public MancalaModel(){
        stones = new ArrayList<Stone>();
    }

    public void addStone (Stone stone) {
        stones.add(stone);
    }

    public void removeStone (Stone stone) {
        stones.remove(stone);
    }

    public int getStoneIndex(Stone stone) {
        for (int i = 0; i < stones.size(); i++) {
            if (stones.get(i) == stone) {
                return i;
            }
        }
        return -1;
    }

    public void moveStone (Stone stone, int newPos) {
        stones.get(getStoneIndex(stone)).setPocket(newPos);
    }
}
