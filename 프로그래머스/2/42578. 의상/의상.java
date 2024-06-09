import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        //옷 넣기, 옷 있으면 1
        for(int i=0;i<clothes.length;i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0) + 1);
        }
        
        //옷 조합하기
        for(String s : map.keySet()){
            answer = answer * (map.get(s)+1);
        }
        
        answer = answer - 1;
        
        return answer;
    }
}