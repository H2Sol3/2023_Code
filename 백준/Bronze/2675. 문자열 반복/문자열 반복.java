import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //몇 번 할건지
        int num = scan.nextInt();
        
        while(num>0){
            //문자열, 숫자
            int r = scan.nextInt();
            String s = scan.nextLine();
            
            for(int i=0;i<s.length();i++){
                for(int j=0;j<r;j++){
                    if(s.charAt(i) != ' '){
                        System.out.print(s.charAt(i));
                    }
                }
            }
            num--;
            System.out.println();
        }
        
    }
}