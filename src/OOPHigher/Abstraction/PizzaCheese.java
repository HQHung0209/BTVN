package OOPHigher.Abstraction;

public class PizzaCheese extends Pizza{

    @Override
    public void category() {
        System.out.println("Pizza cheese");
    }

    @Override
    public void size() {
        System.out.println("L");
    }

    @Override
    public void sauce() {
        System.out.println("tomato sauce");
    }

    @Override
    public void prepare() {
        System.out.println("Prepare");
    }

    @Override
    public void cut() {
        System.out.println("Cut 8");
    }

    @Override
    public void box() {
        System.out.println("box");
    }
}
