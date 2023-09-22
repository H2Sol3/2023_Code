import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strArr = str.split(" ");
        int cnt = 0;
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].isEmpty()){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}