import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int gram = scan.nextInt();
        int cnt = 0;
        while(true){
            //5로 나눠질 경우
            if(gram % 5 == 0){
                cnt += gram / 5;
                break;
            }
            //아닐 때는
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