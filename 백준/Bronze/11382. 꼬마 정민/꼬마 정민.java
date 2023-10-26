import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        for(int i=0;i<3;i++){
            long n = scan.nextLong();
            sum+=n;
        }
        System.out.println(sum);
    }

}