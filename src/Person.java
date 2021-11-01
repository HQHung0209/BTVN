public class Person {
    //1 : Thuộc tính : thể hiện của lớp đối tượng
    String name;
    int age;
    String address;

    //2 : Phương thức
    public void showInfo(){
        System.out.println("Tên " +name) ;
        System.out.println("Tuổi " +age) ;
        System.out.println("Địa chỉ " +address) ;
    }

    // 3: phương thức khởi tạo (constructor)
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
