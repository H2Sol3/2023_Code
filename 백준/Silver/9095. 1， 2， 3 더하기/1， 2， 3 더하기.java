import java.util.Scanner;
public class Main{
    public static int[] dp = new int[11];
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for(int i=0;i<testCase;i++){
            int n = scan.nextInt();
            int answer = DP(n);
            System.out.println(answer);
        }
    }
    
    public static int DP(int n){
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}