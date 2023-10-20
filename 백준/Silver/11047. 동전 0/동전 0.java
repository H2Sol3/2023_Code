import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //동전종류
        int k = scan.nextInt(); //합
        int[] type = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            type[i] = scan.nextInt();
        }
        int length = type.length;
        //맨 뒤에서부터 나누기
        for(int i=0;i<length;i++){
            if(type[length-i-1] <= k){
                cnt += k / type[length-i-1];
                k = k % type[length-i-1];
            }
        }
        System.out.println(cnt);
    }

}