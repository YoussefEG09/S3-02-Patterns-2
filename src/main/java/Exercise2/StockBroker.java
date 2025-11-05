package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class StockBroker implements Broker{
    private List<Observer> observers;
    private double stockMarket;

    public StockBroker(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyChanges() {
        for (Observer o : observers) {
            o.updatedMarket(stockMarket);
        }
    }
    public void setStockMarket(double stockMarket){
            this.stockMarket = stockMarket;
            System.out.println("The stock market price has changed " + stockMarket + " %.");
            notifyChanges();
    }
}
