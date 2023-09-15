import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        int sum = 0;
        for(int i=0;i<str.length();i++){
            sum += Integer.parseInt(str.charAt(i)+"");
        }
        System.out.println(sum);
        
        
 }
}