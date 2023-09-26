import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        answer[1] = 0;
        
        for(int i=0;i<array.length;i++){
            max = Math.max(max,array[i]);
            answer[0]=max;
            if(max == array[i]){
                answer[1] = i;
            }
        } 
        return answer;
    }
}