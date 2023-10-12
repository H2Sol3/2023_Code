import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        if(m == 1 || m == 2){
            System.out.println("NEWBIE!");
        }else if(m <= n && m > 2){
            System.out.println("OLDBIE!");
        }else{
            System.out.println("TLE!");
        }

    }
}