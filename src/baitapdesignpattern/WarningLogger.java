package baitapdesignpattern;

public class WarningLogger extends AbstractConsole {
    public WarningLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Warning: "+message);
    }
}
