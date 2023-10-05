import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //바구니 수
        int n = scan.nextInt();
        // 반복 수
        int m = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<m;i++){
            //바구니, 숫자 입력
            int basket_1 = scan.nextInt();
            int basket_2 = scan.nextInt();
            int num = scan.nextInt();

            for(int j=basket_1;j<=basket_2;j++){
                arr[j-1] = num;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}