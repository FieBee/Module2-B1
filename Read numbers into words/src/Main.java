import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc");
        int n = scanner.nextInt();
        String result = "";

        int hundred = n / 100;
        int tens = n / 10;
        int ones = n % 10;

        if (n >= 0 && n < 10) {
            switch (n) {
                case 0:
                    result += "Khong";
                    break;
                case 1:
                    result += "Mot";
                    break;
                case 2:
                    result += "Hai";
                    break;
                case 3:
                    result += "Ba";
                    break;
                case 4:
                    result += "Bon";
                    break;
                case 5:
                    result += "Nam";
                    break;
                case 6:
                    result += "Sau";
                    break;
                case 7:
                    result += "Bay";
                    break;
                case 8:
                    result += "Tam";
                    break;
                case 9:
                    result += "Chin";
                    break;
            }
        } else if (n < 20) {
            switch (n - 10) {
                case 0:
                    result += "Muoi";
                    break;
                case 1:
                    result += "Muoi Mot";
                    break;
                case 2:
                    result += "Muoi Hai";
                    break;
                case 3:
                    result += "Muoi Ba";
                    break;
                case 4:
                    result += "Muoi Bon";
                    break;
                case 5:
                    result += "Muoi Nam";
                    break;
                case 6:
                    result += "Muoi Sau";
                    break;
                case 7:
                    result += "Muoi Bay";
                    break;
                case 8:
                    result += "Muoi Tam";
                    break;
                case 9:
                    result += "Muoi Chin";
                    break;
            }
        } else if (n < 100) {
            switch (tens) {
                case 2 -> result += "Hai Muoi";
                case 3 -> result += "Ba Muoi";
                case 4 -> result += "Bon Muoi";
                case 5 -> result += "Nam Muoi";
                case 6 -> result += "Sau Muoi";
                case 7 -> result += "Bay Muoi";
                case 8 -> result += "Tam Muoi";
                case 9 -> result += "Chin Muoi";
            }
            switch (ones) {

                case 1 -> result += "Mot";
                case 2 -> result += "Hai";
                case 3 -> result += "Ba";
                case 4 -> result += "Bon";
                case 5 -> result += "Nam";
                case 6 -> result += "Sau";
                case 7 -> result += "Bay";
                case 8 -> result += "Tam";
                case 9 -> result += "Chin";
            }

        } else if (n >= 100) {
            switch (hundred) {
                case 1 -> result += "Mot Tram ";
                case 2 -> result += "Hai Tram ";
                case 3 -> result += "Ba Tram ";
                case 4 -> result += "Bon Tram ";
                case 5 -> result += "Nam Tram ";
                case 6 -> result += "Sau Tram ";
                case 7 -> result += "Bay Tram ";
                case 8 -> result += "Tam Tram ";
                case 9 -> result += "Chin Tram ";
            }
            switch ((n / 10) % 10) {
                case 0 -> result += "Le ";
                case 1 -> result += "Muoi ";
                case 2 -> result += "Hai Muoi ";
                case 3 -> result += "Ba Muoi ";
                case 4 -> result += "Bon Muoi ";
                case 5 -> result += "Nam Muoi ";
                case 6 -> result += "Sau Muoi ";
                case 7 -> result += "Bay Muoi ";
                case 8 -> result += "Tam Muoi ";
                case 9 -> result += "Chin Muoi ";
            }
            switch (ones) {
                case 1 -> result += "Mot";
                case 2 -> result += "Hai";
                case 3 -> result += "Ba";
                case 4 -> result += "Bon";
                case 5 -> result += "Nam";
                case 6 -> result += "Sau";
                case 7 -> result += "Bay";
                case 8 -> result += "Tam";
                case 9 -> result += "Chin";
            }
        }
        System.out.println(result);


    }
}




