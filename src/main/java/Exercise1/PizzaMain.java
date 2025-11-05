package Exercise1;

public class PizzaMain {
    public static void main (String[] args) {
        MestrePizza mestre = new MestrePizza();

        PizzaBuilder hawaiian = new HawaiianPizzaBuilder();
        mestre.setPizzaBuilder(hawaiian);

        Pizza hawaiianPizza = mestre.constructPizza();
        System.out.println(hawaiianPizza);

        PizzaBuilder fourCheese = new FourCheesePizzaBuilder();
        mestre.setPizzaBuilder(fourCheese);

        Pizza fourCheesePizza = mestre.constructPizza();
        System.out.println(fourCheesePizza);
    }
}
