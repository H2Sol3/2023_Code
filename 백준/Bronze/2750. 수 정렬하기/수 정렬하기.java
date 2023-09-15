import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for(int n : arr){
            System.out.println(n);
        }
    }
}