import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] first_arr = Arrays.copyOfRange(num_list,n,num_list.length);
        int[] second_arr = Arrays.copyOfRange(num_list,0,n);
        
        for(int i=0;i<first_arr.length;i++){
            answer[i] = first_arr[i];
        }
        for(int i=0;i < second_arr.length;i++){
            answer[i+first_arr.length] = second_arr[i];
        }
        
        return answer;
    }
}