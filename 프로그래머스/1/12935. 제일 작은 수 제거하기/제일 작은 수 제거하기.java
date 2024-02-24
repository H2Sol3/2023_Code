import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        int num = 0;
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            for(int i=0;i<arr.length;i++){
                list.add(arr[i]);
            }
            Arrays.sort(arr);
            num = arr[0];
            
            for(int i=0;i<list.size();i++){
                if(list.get(i) == num){
                    list.remove(i);
                }
            }
            answer = new int[list.size()];
            
            for(int i=0;i<list.size();i++){
                answer[i] = list.get(i);
                
            }
        }
        
        return answer;
    }
}