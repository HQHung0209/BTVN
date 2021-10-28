import java.util.Scanner;

public class Btvn1 {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số cần kiểm tra : ");
        n = scanner.nextInt();
        if (n < 2){
            System.out.println("Không phải số nguyên tố");
        }else if(n==2){
            System.out.println("2 là số nguyên tố");
        }
        else{
            for ( int i = 2 ; i <= (n-1) ; i++){
                if( n % i == 0){
                    System.out.println(" không phải số nguyên tố");
                }else{
                    System.out.println(" là số nguyên tố");
                }
            }
        }
    }
}
