import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float weight ;
        float height ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập cân nặng : ");
        weight = sc.nextFloat();
        if (weight < 0){
            System.out.println("Bạn đã nhập sai cân nặng");
            System.exit(0);
        }
        System.out.println("Mời bạn nhập chiều cao : ");
        height = sc.nextFloat();
        if ( height < 0 ){
            System.out.println("Bạn đã nhập sai chiều cao");
            System.exit(0);
        }
        float BMI = weight / (height * height);

        if (BMI >= 40) {
            System.out.println("BMI của bạn là : "+BMI+" | Tình trạng : béo phì độ 3");
        }else if ( BMI >= 35){
            System.out.println("BMI của bạn là : "+BMI+" | Tình trạng : béo phì độ 2");
        }else if ( BMI >= 30){
            System.out.println("BMI của bạn là : "+BMI+" | Tình trạng : béo phì độ 1");
        }else if ( BMI >= 25){
            System.out.println("BMI của bạn là : "+BMI+" | Tình trạng : tiền béo phì");
        }else if ( BMI == 25){
            System.out.println("BMI của bạn là : "+BMI+" | Tình trạng : thừa cân");
        }else if ( BMI >= 18.5){
            System.out.println("BMI của bạn là : "+BMI+" | Tình trạng : Bình thường");
        }else if ( BMI < 18.5){
            System.out.println("BMI của bạn là : "+BMI+" | Tình trạng : Cân nặng thấp (Gầy)");
        }
    }
}
