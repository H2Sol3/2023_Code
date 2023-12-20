import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        //선수 넣기
        for(String person : participant){
            map.put(person, map.getOrDefault(person, 0) + 1);//없으면0
        }
        
        //완주한 사람들 제외
        for(String person: completion){
            map.put(person,map.get(person)-1);
        }
        
        for(String person : map.keySet()){
            if(map.get(person) > 0){
                answer = person;
            }
        }
        
        return answer;
    }
}