import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int answer = a*b*c;
        int[] aa = new int[10];
        String str = String.valueOf(answer);
        for(int i=0;i<str.length();i++){
            for(int j=0;j<10;j++){
                if(Integer.parseInt(str.charAt(i)+"") == j){
                    aa[j]+=1;
                }
            }
        }

        for(int s : aa){
            System.out.println(s);
        }

    }
}