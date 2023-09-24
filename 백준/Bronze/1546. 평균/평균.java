import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int max = 0;
        double avg = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            avg+=arr[i];
            max = Math.max(arr[i], max);
        }

        avg = avg/arr.length;
        double newAvg = (double)avg/max*100;

        System.out.println(newAvg);
    }
}