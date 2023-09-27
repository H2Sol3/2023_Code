import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i=0;i<a.length();i++){
            String str = a.charAt(i)+"";
            if(str == str.toLowerCase()){
                System.out.print(str.toUpperCase());
            }else{
                System.out.print(str.toLowerCase());
            }
        }
        
    }
}