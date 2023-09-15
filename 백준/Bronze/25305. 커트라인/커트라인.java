import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            int num = scan.nextInt();
            arr.add(num);
        }
        Collections.sort(arr);
        Collections.reverse(arr);

        System.out.println(arr.get(k-1));
    }
}