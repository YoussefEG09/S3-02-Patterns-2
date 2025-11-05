package Exercise1;

public class FourCheesePizzaBuilder implements PizzaBuilder{
    private Pizza pizza;

    public FourCheesePizzaBuilder(){
        this.pizza = new Pizza();
    }

    @Override
    public void setPizzaSize() {pizza.setSize("Medium");}

    @Override
    public void setPizzaDough() {pizza.setDough("Crispy crust");}

    @Override
    public void setPizzaToppings() {pizza.setToppings("Cheddar + Mozzarella + Blue Cheese + Feta Cheese");}

    @Override
    public Pizza getPizza() {return pizza;}


}
