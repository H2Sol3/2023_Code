import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //별
        int num = scan.nextInt();
        char star = '*';
        char blank = ' ';
        int a = 1;
        for(int i=1;i<=num;i++){
            //공백
            for(int j=1;j<i;j++) {
                System.out.print(blank);
            }
            //별
            for(int j=0;j<2*num-a;j++){
                System.out.print(star);
            }
            a += 2;
            System.out.println();
        }
    }
}