package Exercise1;

import java.util.List;

public interface PizzaBuilder {
    void setPizzaSize();
    void setPizzaDough();
    void setPizzaToppings();

    Pizza getPizza();
}
