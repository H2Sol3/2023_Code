import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
            if(arr[i] < x){
                System.out.print(arr[i]+" ");
            }
        }
    }
}