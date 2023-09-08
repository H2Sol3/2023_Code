import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 논문 인용 횟수 배열을 오름차순으로 정렬
        int n = citations.length;
        int hIndex = 0;

        // H-Index 계산
        for (int i = 0; i < n; i++) {
            int currentH = Math.min(citations[i], n - i);
            hIndex = Math.max(hIndex, currentH);
        }

        return hIndex;
    }
}
