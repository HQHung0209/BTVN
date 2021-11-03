package OOPHigher.Abstraction;

public class DemoAbstraction {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(new PizzaCheese());

    }
}
