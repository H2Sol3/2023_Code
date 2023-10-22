import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 1000-scan.nextInt();
        int cnt = 0;
        
        while (n > 0) {
            if (n >= 500) {
                cnt += n / 500;
                n = n % 500;
            }
            if (n >= 100) {
                cnt += n / 100;
                n = n % 100;
            }
            if (n >= 50) {
                cnt += n / 50;
                n = n % 50;
            }
            if (n >= 10) {
                cnt += n / 10;
                n = n % 10;
            }
            if (n >= 5) {
                cnt += n / 5;
                n = n % 5;
            }
            if (n >= 1) {
                cnt += n;
                n = n % 1;
            }
        }
        System.out.print(cnt);

    }

}