import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        String[] n_str = new String[n];
        String[] m_str = new String[m];
        
        for(int i=0;i<n;i++){
            n_str[i] = br.readLine();
        }
        
        for(int i=0;i<m;i++){
            m_str[i] = br.readLine();
        }
        
        int cnt = 0;
        
        for(int i=0;i<n_str.length;i++){
            for(int j=0;j<m_str.length;j++){
                if(n_str[i].contains(m_str[j])){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);*/
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int count = 0;
        Set<String> arr = new HashSet<>();

        for (int i = 0; i < N ; i++) {
            arr.add(br.readLine());
        }

        for (int i = 0; i < M ; i++) {
            if(arr.contains(br.readLine())) count++;
        }

        System.out.println(count);

    }
}