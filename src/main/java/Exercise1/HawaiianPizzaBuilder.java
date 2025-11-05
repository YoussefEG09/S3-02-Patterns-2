package Exercise1;

public class HawaiianPizzaBuilder implements PizzaBuilder{
    private Pizza pizza;

    public HawaiianPizzaBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void setPizzaSize() {pizza.setSize("Large");}

    @Override
    public void setPizzaDough() {pizza.setDough("Thin crust");}

    @Override
    public void setPizzaToppings() {pizza.setToppings("Ham + Pinneapple + Chesse + Tomato");}

    @Override
    public Pizza getPizza() {return pizza;}
}
