package OOPHigher.Inheritance;

public class Cat extends Animal {
    private String color;
    public Cat (String name , int weight , String color){
        super(name, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Cat eat Fish");
    }
}
