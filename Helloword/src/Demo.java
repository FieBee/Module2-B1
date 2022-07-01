import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Moi ban nhap vao can nang");
        weight = scanner.nextDouble();
        System.out.println("Moi ban nhap vao chieu cao");
        height = scanner.nextDouble();
        bmi = weight/(height*height);
        if(bmi<18.5){
            System.out.println("Tzhieucan");
            if (bmi<23){
                System.out.println("Bt");
                if (bmi<30){
                    System.out.println("Beos quas roi`");
                }
            }
        }
    }
}
