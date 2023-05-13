import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = String.valueOf(n); //문자열로 변환해주기
        
        for(int i=0;i<s.length();i++){
            answer += s.charAt(i)-48;//문자열이니까 -48해주기
        }
        
        return answer;
    }
}