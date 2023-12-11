import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        //push
        for(String participantName : participant){
            map.put(participantName, map.getOrDefault(participantName,0)+1);
        }
        
        //pop
        for(String completionName : completion){
            map.put(completionName, map.get(completionName)-1);
        }
        
        for(String person : map.keySet()){
            if(map.get(person) > 0){
                answer = person;
                break;
            }
        }
        
        
        /*Stack<String> stack = new Stack<>();
        
        for(int i=0;i<participant.length;i++){
            stack.push(participant[i]);
        }
        
        for(int i=0;i<completion.length;i++){
            stack.remove(completion[i]);
        }
        
        answer = stack.get(0);*/
        
        return answer;
    }
}