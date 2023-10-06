import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //테스트 케이스 개수
        int testCase = scan.nextInt();
        String[] str = new String[testCase];
        for(int i=0;i<testCase;i++){
            str[i] = scan.next();

            if(str[i].length() == 1){
                System.out.println(str[i]+str[i]);
            }else{
                System.out.print(str[i].charAt(0));
                System.out.println(str[i].charAt(str[i].length()-1));
            }
        }

    }
}