package codebranch;

//public class GameLogic {
//    private final static String[] gameScoreChoice = {"Love 0", "15", "30", "40", "Deuce", "Advantage", "Game", "Set"};
//
//    public String keepScore(AbstractPlayer player) {
//        String x = null;
//        if (player.getPlayerPoint() == 1 && player.getPlayerName().equalsIgnoreCase("bob")) {
//            System.out.println( "Điểm cho bob : "+gameScoreChoice[0]);
//        } else {
//            System.out.println("no point to add to player1");
//        }
//        if (player.getPlayerPoint() == 1 && player.getPlayerName().equalsIgnoreCase("joe")) {
//            System.out.println(gameScoreChoice[0]);
//        } else {
//            System.out.println("no point to add to player1");
//        }
//        return x;
//    }
//}

public class GameLogic {
    private static final String[] mangDiem = {"Love","15","30", "40","deuce", "win", "game", "set" };
    public String keepScore(AbstractPlayer player) {
        if (player.getPlayerPoint() == 1 && player.getPlayerName().equalsIgnoreCase("Toan")) {
            System.out.println("Số điểm anh Toàn ghi được = " + mangDiem[1]);
        }
        else if (player.getPlayerPoint() == 0) {
            return "game thủ Toàn không ghi được điểm";
        }
        else if (player.getPlayerPoint() == 1 && player.getPlayerName().equalsIgnoreCase("Nha")) {
            System.out.println("Số điểm Nhã sát gái ghi được = " + mangDiem[1]);
        }
        else if (player.getPlayerPoint() == 0) {
            System.out.println("Nhã đã không ghi được điểm nên bị các em gái bỏ");
        } else {
            System.out.println("Hãy nhập số điểm và Tên Người chơi bạn muốn thêm điểm");
        }
        return null;
    }
}