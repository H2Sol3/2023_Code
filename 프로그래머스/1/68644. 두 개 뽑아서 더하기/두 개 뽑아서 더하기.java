import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer=new int[1];
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i != j){
                    int sum = numbers[i] + numbers[j];
                    set.add(sum);
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList(set);
        Collections.sort(list);
        answer = new int[list.size()];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i).intValue();
        }
        
        return answer;
    }
}