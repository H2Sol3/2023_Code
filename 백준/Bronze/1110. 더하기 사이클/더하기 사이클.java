import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int cnt = 0;
        int num = 0;
        int sum = n;
        
        while (true) {
            int firstR = sum % 10;

            if (sum < 10) {
                sum = sum * 11;
            } else {
                num = sum / 10 + sum % 10;
                int secondR = num % 10;
                sum = firstR * 10 + secondR;
            }

            cnt++;

            if (n == sum) {
                break;
            }

        }
        System.out.println(cnt);
    }

}