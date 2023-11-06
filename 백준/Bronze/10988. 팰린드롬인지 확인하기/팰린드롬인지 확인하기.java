import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int cnt = 0;

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println(0);
                break;
            }else{
                cnt++;
            }
        }

        if(cnt == str.length()/2){
            System.out.println(1);
        }
    }
}
