package OOPHigher.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name ="Animal";
        animal1.weight = 1;

        animal1.eat();

        Cat cat1 = new Cat();
        cat1.name = "My cat";
        cat1.weight = 2;

        cat1.eat();
    }
}
