package Exercise2;

public class BankAgency implements Observer{
    private String bankName;

    public BankAgency (String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void updatedMarket(double stockMarket) {
        System.out.println("Bank Agency " + bankName + " has received the stock market update: " + stockMarket + "%");
    }
}
