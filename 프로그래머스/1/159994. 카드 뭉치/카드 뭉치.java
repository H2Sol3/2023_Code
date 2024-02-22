import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
 
        int idxCards1 = 0;
        int idxCards2 = 0;
 
        for (int i = 0; i < goal.length; i++) {
            if(idxCards1 < cards1.length && goal[i].equals(cards1[idxCards1])) {
                idxCards1++;
                continue;
            }
            
            if(idxCards2 < cards2.length && goal[i].equals(cards2[idxCards2])) {
                idxCards2++;
                continue;
            }
 
            answer = "No"; // 위 조건문에서 하나라도 성립되지 않을 경우 No를 출력하도록 함
            return answer;
        }
 
        return answer;
    }
}