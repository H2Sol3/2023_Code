import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[31];
        for (int i = 1; i <= 28; i++) {
            int num = scan.nextInt();
            arr[num] = 1;
        }

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == 0) {
                System.out.println(j);
            }
        }
    }
}