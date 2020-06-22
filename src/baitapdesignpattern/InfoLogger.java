package baitapdesignpattern;

public class InfoLogger extends AbstractConsole {
    public InfoLogger(int level){
        this.level= level;
    }
    @Override
    protected void write(String m) {
        System.out.println("Info: "+m);
    }
}
