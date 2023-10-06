import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        StringBuilder sb1 = new StringBuilder(a);
        StringBuilder sb2 = new StringBuilder(b);

        sb1.reverse();
        sb2.reverse();

        a = String.valueOf(sb1);
        b = String.valueOf(sb2);

        if(Integer.parseInt(a) > Integer.parseInt(b)){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }
}