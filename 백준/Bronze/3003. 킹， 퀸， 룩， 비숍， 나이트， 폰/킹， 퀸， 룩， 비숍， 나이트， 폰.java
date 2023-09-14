import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        int[] arr = new int[6];
        //체스 입력받기
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        //계산하기
        for(int i=0;i<arr.length;i++){
            System.out.print(chess[i] - arr[i] + " ");
        }
    }
}