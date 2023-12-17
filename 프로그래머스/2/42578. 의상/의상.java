import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1; // 초기값은 1로 설정
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            // 각 의상 종류별로 몇 개의 의상이 있는지 카운트
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        // 조합 계산
        for (int count : map.values()) {
            answer *= (count + 1); // 해당 의상 종류를 선택하지 않은 경우를 고려하여 +1
        }

        answer = answer - 1;
        return answer;
    }
}
