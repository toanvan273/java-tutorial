package pattern_factory;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VPBANK);
        System.out.println(bank.getBankName()); // TPBank
    }
}
