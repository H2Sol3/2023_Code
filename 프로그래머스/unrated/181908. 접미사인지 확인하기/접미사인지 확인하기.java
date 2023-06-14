import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] strArr = new String[my_string.length()];
        for(int i=0;i<strArr.length;i++){
            strArr[i]="";
            for(int j=i;j<strArr.length;j++){
                strArr[i] += my_string.charAt(j);
            }
            if(strArr[i].equals(is_suffix)){
                return 1;
            }
        }
        
        return answer;
    }
}