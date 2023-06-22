import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(flag[i] == true){
                int length = arr[i]*2;
                
                for(int j=0;j<length;j++){
                    list.add(arr[i]);    
                }
            }else{
                    System.out.println(list);
                for(int k=0;k<arr[i];k++){
                    list.remove(list.size()-1);    
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}