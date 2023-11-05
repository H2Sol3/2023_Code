import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase =scan.nextInt();
        int[] arr = new int[testCase];

        for(int i=0;i<testCase;i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[0]*arr[arr.length-1]);

    }
}