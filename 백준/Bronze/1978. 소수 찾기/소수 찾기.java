import java.util.*;
public class Main {
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if(arr[i] != 1){
                if(isPrime(arr[i])){
                    cnt++;
                }
            }

        }

        System.out.println(cnt);
    }
}