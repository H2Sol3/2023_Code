import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            int cnt = 0;
            for(int j=0;j<s.length();j++){
                if(i != j && s.charAt(i) != s.charAt(j)){
                    cnt++;
                }
            }
            if(cnt == s.length()-1) answer+=s.charAt(i);
        }
        char[] charArr = answer.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}