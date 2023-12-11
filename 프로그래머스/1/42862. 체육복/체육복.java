import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int cnt = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i] == reserve[j]){
                    cnt++;
                    lost[i] = -3;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                
                int lostFrontNum = lost[i]-1;
                int lostBackNum = lost[i]+1;
                
                if(reserve[j] == -1){
                    continue;
                }else if(lostFrontNum == reserve[j] || lostBackNum == reserve[j]){
                    cnt++;
                    reserve[j] = -1;
                    break;
                }
                
            }
        }
        
        answer = n-lost.length+cnt;
        
        return answer;
    }
}