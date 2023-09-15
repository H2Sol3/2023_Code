import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] num_list = new int[num];
        int max = -1000000;
        int min = 1000000;
        for(int i=0;i<num;i++){
            num_list[i] = scan.nextInt();
            max = Math.max(max, num_list[i]);
            min = Math.min(min, num_list[i]);
        }
        System.out.print(min+" "+max);
    }
}