import java.util.*;

class Solution {
    public int solution(int[] array) {
        int maxFrequency = 0;
        int mode = -1; // 최빈값 초기값을 -1로 설정

        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < array.length; i++) {
            int cnt = map.getOrDefault(array[i], 0) + 1;
            map.put(array[i], cnt);

            if (cnt > maxFrequency) {
                maxFrequency = cnt;
                mode = array[i];
            } else if (cnt == maxFrequency) {
                mode = -1; // 최빈값이 여러 개인 경우 -1로 설정
            }
        }

        return mode;
    }
}
