import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean sosu(int num) {
        if(num < 2){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n; i <= m; i++) {
            if (sosu(i)) {
                list.add(i);
                sum+=i;
            }
        }

        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}