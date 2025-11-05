package Exercise1;

public class MestrePizza {
    private PizzaBuilder builder;


    public void setPizzaBuilder(PizzaBuilder builder)  {
        this.builder = builder;
    }

    public Pizza constructPizza() {
        builder.setPizzaSize();
        builder.setPizzaDough();
        builder.setPizzaToppings();
        return builder.getPizza();
    }
}
