package Exercise2;

public interface Broker {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyChanges();

}
