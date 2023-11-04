import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float r1 = scan.nextInt();
        float s = scan.nextInt();
        float r2 = 0;

        float fr1 = r1/2;
        r2 = (s - fr1)*2;

        System.out.println((int)r2);

    }
}