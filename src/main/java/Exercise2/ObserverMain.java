package Exercise2;

public class ObserverMain {
    public static void main(String[] args) {
        StockBroker broker = new StockBroker();

        BankAgency bank1 = new BankAgency("BBVA");
        BankAgency bank2 = new BankAgency("La Caixa");
        BankAgency bank3 = new BankAgency("Santander");

        broker.addObserver(bank1);
        broker.addObserver(bank2);
        broker.addObserver(bank3);

        System.out.println("==============================");
        broker.setStockMarket(130.5);
        System.out.println("==============================");
        broker.setStockMarket(-15.42);
    }
}
