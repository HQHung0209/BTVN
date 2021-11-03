package OOPHigher.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
//        Animal animal1 = new Animal();
//        animal1.name ="Animal";
//        animal1.weight = 1;
//
//        animal1.eat();
//
//        Cat cat1 = new Cat();
//        cat1.name = "My cat";
//        cat1.weight = 2;
//
//        cat1.eat();

        Cat cat = new Cat("My cat", 1,"red");
        System.out.println(cat.getName());
        System.out.println(cat.getWeight());
        System.out.println(cat.getColor());
        cat.eat();
        showMessage("Error",new Throwable("Lỗi 404"));


    }
    //overload : phương thức nạp chồng
    public static void showMessage(String message){
        System.out.println(message);
    }
    public  static  void showMessage(String message , Throwable t){
        System.out.println(message);
        System.out.println(t.getMessage());
    }
}
