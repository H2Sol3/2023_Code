import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = 1000 - scan.nextInt();
        int cnt = 0;
        int[] coinValues = {500, 100, 50, 10, 5, 1};

        for(int i=0;i<coinValues.length;i++){
            cnt += n / coinValues[i];
            n = n % coinValues[i];
        }
        
        System.out.print(cnt);
    }

}