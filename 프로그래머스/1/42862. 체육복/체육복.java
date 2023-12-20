import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //lost = reserve
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -3;
                    answer++;
                    break;
                }
            }
        }
        
        //다른 학생들
        for(int i=0;i<lost.length;i++){
                for(int j=0;j<reserve.length;j++){
                    if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                        lost[i] = -1;
                        reserve[j] = -3;
                        answer++;
                    }
                }
        }
        //잃어버리지 않은 학생수 + answer
        // 4 = n - lost + answer
        //5 [4,5] [3,4] cnt 1  5 - lost + answer
        //System.out.println(n);
       // System.out.println(lost.length);
        //System.out.println(answer);
        
        answer = n - lost.length + answer;
        
        
        return answer;
    }
}