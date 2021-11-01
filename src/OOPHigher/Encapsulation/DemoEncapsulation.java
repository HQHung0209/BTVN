package OOPHigher.Encapsulation;

public class DemoEncapsulation {

    public static void main(String[] args) {

        //try catch
/*      try{
            Object a = null;
            int ketQua = a.hashCode();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("tiếp tục");*/

        Product product1 = new Product();
        try {
            product1.setName("haha");
            product1.setWeight(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(product1.getName());
        System.out.println(product1.getWeight());
    }

}
