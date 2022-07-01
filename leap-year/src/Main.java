import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int year ;
        System.out.println("Inter year");
        year = scanner.nextInt();

        if (year %4 ==0) {
            if (year%100==0){
                if (year%400 == 0){
                    System.out.println(year+" is a leap year");
                }else {
                    System.out.println(year+ " is Not a leap year");
                }
            }else {
                System.out.println(year+" is a leap year");
            }
        }
        else {
            System.out.printf("%d is NOT a leap year", year);
        }

    }
}
