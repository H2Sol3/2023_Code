import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> set = new HashSet<>(); // 중복된 값은 필요 없으므로 HashSet을 사용합니다.

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) // 이미 등장한 수
                continue;

            answer[index++] = arr[i];
            set.add(arr[i]);

            if (index >= k) // 서로 다른 수를 모두 선택
                break;
        }

        // k개 미만의 서로 다른 수만 선택했다면 나머지는 -1
        while (index < k) {
            answer[index++] = -1;
        }

        return answer;
    }
}
