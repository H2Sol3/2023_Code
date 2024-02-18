import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int answer = 1;
            for(int j=0;j<b;j++){
                answer=(answer*a)%10;
            } 
            
            if(answer == 0){
                System.out.println("10");        
            }else{
                System.out.println(answer);
            }
        }
        
    }
}