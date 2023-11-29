import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();

        for(int i=0;i<c;i++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            int sum = 0;

            for(int j=0;j<n;j++){
                arr[j] = scan.nextInt();
                sum+=arr[j];
            }

            double avg = (double)sum / n;
            int cnt = 0;

            for(int j=0;j<arr.length;j++){
                if(arr[j] > avg){
                    cnt++;
                }
            }
            
            double winner = (double)cnt/n * 100;
            System.out.printf("%.3f%%\n",winner,"%");
        }
    }
}