import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        //선수 넣기
        for(String person : participant){
            map.put(person, map.getOrDefault(person,0) + 1);
        }
        
        //완주 선수 빼기
        for(String person : completion){
            map.put(person, map.get(person) - 1);
        }
        
        //확인하기
        for(String key : map.keySet()){
            if(map.get(key) > 0){
                answer = key;
            }
        }
        
        return answer;
    }
}