import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Nhap so tien USD");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("So tien can quy doi la "+ quydoi);
    }
}
