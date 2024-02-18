import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer= {2,3};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        
        int cnt = 0;
        
        for(int i=0;i<list.size();i++){
            for(int j=0;j<delete_list.length;j++){
                if(list.get(i) == delete_list[j]){
                    list.set(i,0);
                    cnt++;
                    break;
                }
            }
        }
        
        answer = new int[list.size() - cnt];
        int index = 0;
        
        for(int i=0;i<list.size();i++){
            if(list.get(i) != 0){
                answer[index++] = list.get(i);    
            }
        }
        return answer;
    }
}