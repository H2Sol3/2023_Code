import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] lottoNum = {6,6,5,4,3,2,1};
        int cnt = 0;
        int zero = 0;
        //같은 번호 찾기
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for(int i=0;i<6;i++){
            if(lottos[i] == 0){
                zero++;
            }
            
            for(int j=0;j<6;j++){
                if(lottos[i] == win_nums[j]){
                    cnt++;
                    break;
                }
            }
        }
        
        answer[0] = lottoNum[zero+cnt];
        answer[1] = lottoNum[cnt];
        
        
        return answer;
    }
}