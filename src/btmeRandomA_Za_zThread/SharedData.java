package btmeRandomA_Za_zThread;

public class SharedData {
    Character character;
    int countTime;
    public SharedData() {
        countTime = 0;
    }

    public Character getCharacter() {
        return character;
    }

    public int getCountTime() {
        return countTime;
    }

    public void setCountTime(int countTime) {
        this.countTime = countTime;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
    public boolean checkStop(){
        return countTime<20;
    }
}
