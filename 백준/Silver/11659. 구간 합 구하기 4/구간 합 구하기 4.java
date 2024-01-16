import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int[] arr = new int[n];
        int[] sum = new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            
            if(i>0) {
                sum[i] = sum[i-1] + arr[i];
            }else{
                sum[i] = arr[i];
            }
        }
        
        for(int k=0;k<m;k++){
            int i = scan.nextInt();
            int j = scan.nextInt();
            
            if(i == 1){
                System.out.println(sum[j-1]);
            }else if(i == j){
                System.out.println(arr[j-1]);
            }else{
                System.out.println(sum[j-1]-sum[i-2]);
            }
        }
        
    }
    
}