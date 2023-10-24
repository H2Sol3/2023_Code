import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = scan.nextInt();
            int sum = 0;

            if (n == -1) {
                break;
            }

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.print(n + " = " + list.get(0));
                for(int i=1;i<list.size();i++){
                    System.out.print(" + "+list.get(i));
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }

        }
    }

}