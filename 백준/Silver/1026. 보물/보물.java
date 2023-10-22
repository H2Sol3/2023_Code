import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int sum = 0;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }

        for (int i = 0; i < n; i++) {
            b.add(scan.nextInt());
        }

        Collections.sort(a);
        Collections.sort(b);
        Collections.reverse(b);

        for (int i = 0; i < n; i++) {
            sum += a.get(i) * b.get(i);
        }
        System.out.println(sum);
    }

}