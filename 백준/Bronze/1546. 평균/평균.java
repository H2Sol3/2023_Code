import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double avg = 0.0;
        int max = 0;
        double sum = 0.0;
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            //list.add(Integer.parseInt(st.nextToken()));
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        
        for(int i=0;i<n;i++){
            //sum += list.get(i)/list.get(0)*100;
            sum += (double)arr[i]/max*100;
        }
        avg = sum/n;
        System.out.println(avg);
    }   
}