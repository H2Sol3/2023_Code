import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] += scan.nextInt();
                }
            }
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < m; k++) {
                System.out.print(arr[j][k]+" ");
            }
            System.out.println();
        }
    }
}