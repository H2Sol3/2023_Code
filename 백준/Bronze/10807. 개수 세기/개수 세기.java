import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int v = scan.nextInt();
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}