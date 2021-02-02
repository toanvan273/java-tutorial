package pattern_factory;

public class BankFactory {
    private BankFactory(){}

    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case TPBANK:
                return new TPBank();
            case VIETCOMBANK:
                return new Vietcombank();
            case VPBANK:
                return new VPBank();
            default:
                throw new IllegalArgumentException("This bank is unsupported");
        }
    }
}
