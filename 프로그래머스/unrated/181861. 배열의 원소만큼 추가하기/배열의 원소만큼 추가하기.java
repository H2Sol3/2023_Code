import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int length = 0;
        for(int i:arr){
            length+=i;
        }
        answer = new int[length];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                answer[index]=arr[i];
                index++;
            }
        }
        return answer;
    }
}