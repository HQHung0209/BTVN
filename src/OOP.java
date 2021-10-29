public class OOP {
    public static void main(String[] args) {

        // object và class
//        int a = 10;
//        Person teo = new Person();
//
//        System.out.println(a);
//        System.out.println(teo);

        // kiểu nguyên thủy : String , int , double , ...
        // kiểu vùng nhớ : khởi tạo vùng nhớ để chứa giá trị

        Person teo = new Person();
        teo.name = "Nguyễn Văn Tèo";
        teo.age = 10;
        teo.address = "Biên Hòa";

        teo.showInfo();
    }
}
