import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
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
                    win_nums[j] = -1;
                    cnt++;
                    break;
                }
            }
        }
        
        if(cnt == 6){
            answer[0] = 1;
            answer[1] = 1;
        }else{
            //모두 일치 => cnt + zero
            switch(cnt+zero){
                case 6 :
                    answer[0] = 1;
                    break;
                case 5 :
                    answer[0] = 2;
                    break;
                case 4 :
                    answer[0] = 3;
                    break;
                case 3 :
                    answer[0] = 4;
                    break;
                case 2 :
                    answer[0] = 5;
                    break;
                default :
                    answer[0] = 6;
                    break;
            }
            
            //모두 일치x => cnt
            switch(cnt){
                case 6 :
                    answer[1] = 1;
                    break;
                case 5 :
                    answer[1] = 2;
                    break;
                case 4 :
                    answer[1] = 3;
                    break;
                case 3 :
                    answer[1] = 4;
                    break;
                case 2 :
                    answer[1] = 5;
                    break;
                default :
                    answer[1] = 6;
                    break;
            }
            
        }
        
        return answer;
    }
}