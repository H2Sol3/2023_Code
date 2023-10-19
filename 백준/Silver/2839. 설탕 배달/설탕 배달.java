import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int gram = scan.nextInt();
        int cnt = 0;
        
        while(true){
            if(gram % 5 == 0){
                cnt += gram / 5;
                break;
            }
            gram -= 3;
            cnt++;
            
            if(gram < 0){
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}