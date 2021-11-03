package OOPHigher.Abstraction;

public class PizzaStore {
    public void orderPizza(Pizza pizza){
        pizza.category();
        pizza.sauce();
        pizza.box();
        pizza.cut();
        pizza.size();
    }
}
