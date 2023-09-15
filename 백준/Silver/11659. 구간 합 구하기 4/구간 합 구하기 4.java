import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];
        //숫자 입력받기
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if (i == 0) {
                sum[i] = arr[i];
            } else {
                sum[i] = sum[i - 1] + arr[i];
            }
        }
        //i, j 입력받기
       for(int k=0;k<m;k++){
            int i = scan.nextInt()-1;
            int j = scan.nextInt()-1;
            
            if(i==0){
                System.out.println(sum[j]);
            }else{
                System.out.println(sum[j] - sum[i-1]);
            }
            
       } 
        
    }
}