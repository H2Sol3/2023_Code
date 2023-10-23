import java.util.*;

public class Main {
    public static int fibo(int n) {
        int sum = 0;

        if (n == 0) {
            sum = 0;
        }
        if (n == 1) {
            sum = 1;
        }
        if (n >= 2) {
            sum = fibo(n - 1) + fibo(n - 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(fibo(n));
    }
}
