package baitapdesignpattern;

public class ChainPatternExample {
    private static AbstractConsole getChainOfLogger(){
        AbstractConsole info = new InfoLogger(AbstractConsole.INFO);
        AbstractConsole warning = new WarningLogger(AbstractConsole.WARNING);
        info.setNextLogger(warning);
        return info;
    }

    public static void main(String[] args) {
        AbstractConsole ac = getChainOfLogger();
        ac.printMessage(AbstractConsole.INFO, "Day la Info");
        ac.printMessage(AbstractConsole.WARNING,"Day la Warning");
    }
}
