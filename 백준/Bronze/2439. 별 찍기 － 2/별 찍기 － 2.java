import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //별
        int num = scan.nextInt();
        char star = '*';
        char blank = ' ';

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(blank);
            }
            for(int j=1;j<=i;j++){
                System.out.print(star);
            }
            System.out.println();
        }


    }
}