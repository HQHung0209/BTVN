import java.util.Scanner;

public class TimSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số cần kiểm tra : ");
         int value = scanner.nextInt();

         if ( value < 2 ){
             System.out.println("Số "+value+" không phải là số nguyên tố");
         }else {
             int count = 0 ;

             for( int i = 2 ; i < value ; i++){
                 if( value % i == 0){
                     count ++;
                     break;
                 }
             }

             if(count == 0){
                 System.out.println("Số "+value+" là số nguyên tố");
             }else{
                 System.out.println("Số "+value+" không phải là số nguyên tố");
             }
         }
    }
}
