import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d); //작은 값부터 해주는게 더 많은 값을 뽑을 수 있으니까
        for(int i=0;i<d.length;i++){
            budget -= d[i]; //전체 예산에서 팀 예산 빼주기
            if(budget < 0){ //0보다 작다는건 최대 예산을 넘었다는 것
                break; //중지하기
            }
            answer++; //예산 통과 팀 ++ 해주기
        }
        return answer;
    }
}