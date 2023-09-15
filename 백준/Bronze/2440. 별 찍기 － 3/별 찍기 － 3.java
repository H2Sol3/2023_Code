import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            char star = '*';
            for(int i=0;i<num;i++){
                for(int j=i;j<num;j++){
                    System.out.print(star);
                }
                System.out.println();
            }
    }
}