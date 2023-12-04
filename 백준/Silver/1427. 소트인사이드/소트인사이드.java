import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = String.valueOf(n);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<str.length();i++){
            int num = Integer.parseInt(str.charAt(i)+"");
            list.add(num);
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        
        for(Integer i:list){
            System.out.print(i);
        }
    }
}