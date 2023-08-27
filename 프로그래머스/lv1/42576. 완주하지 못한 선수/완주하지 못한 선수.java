import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap();
        //참가자 명단을 맵에 추가한다. 키는 이름, 값은 인원 수
        for(String person : participant){
            map.put(person, map.getOrDefault(person, 0) + 1);
        }
        //완주자명단을 맵에서 제외한다.
        for(String person : completion){
            map.put(person, map.get(person) - 1);
        }
        //남은 인원 중 완주하지 못한 선수를 찾아서 반환한다.
        for(String person : map.keySet()){
            if(map.get(person) > 0){
                answer = person;
                break;
            }
        }
        
        
        
        
        
  /*      for(int i=0;i<participant.length;i++){
            int cnt = 0;
            for(int j=0;j<completion.length;j++){
                if(!participant[i].equals(completion[j])){
                    cnt++;
                }
            }
            if(cnt == completion.length){
                return answer = participant[i];
            }
        } */
        return answer;
    }
}