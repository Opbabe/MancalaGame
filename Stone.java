public class Stone {
    private String player;
    private int xPosition;
    private int yPosition;
    private int pocket;

    public Stone(String player, int x, int y, int pocket) {
        this.player = player;
        xPosition = x;
        yPosition = y;
        this.pocket = pocket;
    }

    public void setPosition(int x, int y) {
        xPosition = x;
        yPosition = y;
    }

    // POCKET NUMBERS:
    /*
     * A PIT: 0
     * A Pockets: 1-6
     * B PIT: 13
     * B Pockets: 7-12
     */
    public void setPocket(int pocket) {
        this.pocket = pocket;
    }
}
