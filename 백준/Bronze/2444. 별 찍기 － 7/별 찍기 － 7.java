import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //별
        int num = scan.nextInt();
        char star = '*';
        char blank = ' ';
        int a = 3;

        for(int i=1;i<=num;i++){
            //공백
            for(int j=i;j<num;j++) {
                System.out.print(blank);
            }
            //별
            for(int j=0;j<2*i-1;j++){
                System.out.print(star);
            }
            System.out.println();
        }

        for(int i=1;i<num;i++){
            //공백
            for(int j=0;j<i;j++) {
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