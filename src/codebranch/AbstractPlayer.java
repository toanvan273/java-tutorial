package codebranch;

import java.util.Objects;

public class AbstractPlayer {
    private String playerName;
    private int playerPoint;

    public AbstractPlayer(String playerName, int playerPoint) {
        this.playerName = playerName;
        this.playerPoint = playerPoint;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerPoint() {
        return playerPoint;
    }

    public void setPlayerPoint(int playerPoint) {
        this.playerPoint = playerPoint;
    }

    @Override
    public String toString() {
        return "AbstractPlayer{" +
                "player='" + playerName + '\'' +
                ", plyerPoint=" + playerPoint +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPlayer that = (AbstractPlayer) o;
        return playerPoint == that.playerPoint &&
                playerName.equals(that.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, playerPoint);
    }
}
