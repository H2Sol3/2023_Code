import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int totalSum = 0;
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(i == 0){
                sum[i]=arr[i];
            }
            if(i != 0){
                sum[i]=arr[i]+sum[i-1];
            }
            totalSum+=sum[i];
        }

        System.out.println(totalSum);
    }

}