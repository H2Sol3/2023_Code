import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(A);
        int length = A.length()-1;
        
        if(A.equals(B)){
            return answer;
        }else{
            for(int i=0;i<length;i++){
                char temp = sb.charAt(length);
                sb.delete(length, A.length());
                sb.insert(0,temp);

                
                if(sb.toString().equals(B)){
                    answer = i+1;
                    return answer;
                }
                System.out.println(sb);    
            }
            answer = -1;
            return answer;
        }
    }
}