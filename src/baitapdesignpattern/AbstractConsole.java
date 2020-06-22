package baitapdesignpattern;

public abstract class AbstractConsole {
    public static int INFO = 1;
    public static int WARNING = 2;
    protected int level;
    protected AbstractConsole nextLogger;
    public void setNextLogger(AbstractConsole nextLogger){
        this.nextLogger = nextLogger;
    }
    public void printMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.printMessage(level,message);
        }
    }
    abstract protected  void  write(String message);
}
