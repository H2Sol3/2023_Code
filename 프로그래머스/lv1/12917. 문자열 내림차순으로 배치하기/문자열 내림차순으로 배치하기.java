import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<c.length;i++){
            answer+=c[c.length-1-i];
        }
  //      for(int i=0;i<s.length();i++){
  //          c[i] = s.charAt(s.length()-1-i);
  //         answer+=c[i];
  //      }
        
        return answer;
    }
}