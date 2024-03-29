import java.util.*;

public class Main {
    public static int fibo(int n){
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(fibo(n));

    }
}