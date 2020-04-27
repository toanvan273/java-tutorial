package codebranch;

public class Main {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();
        gameLogic.keepScore(new AbstractPlayer("Toan", 2));
        gameLogic.keepScore(new AbstractPlayer("Nha", 1));
    }
}
