import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 오름차순으로 정렬
        int hIndex = 0;

        // H-Index 계산
        for (int i = 0; i < citations.length; i++) {
            int currentH = Math.min(citations[i], citations.length - i);
            hIndex = Math.max(hIndex, currentH);
        }

        return hIndex;
    }
}
