import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=0;i<n;i++){
            int m1 = scan.nextInt();
            int m2 = scan.nextInt();
            int mul = m1*m2;
            
            while(m1 != 0){
                int tmp = m2%m1;
                m2=m1;
                m1=tmp;
            }
            
            System.out.println(mul/m2);
        }
    }
}