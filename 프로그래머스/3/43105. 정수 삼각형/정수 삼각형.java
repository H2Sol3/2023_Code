class Solution {
    public int solution(int[][] triangle) {
        int height = triangle.length;

        // DP 배열 초기화
        int[][] dp = new int[height][];
        for (int i = 0; i < height; i++) {
            dp[i] = new int[i + 1];
        }
        dp[0][0] = triangle[0][0];

        // 다이내믹 프로그래밍을 통해 최댓값 계산
        for (int i = 1; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
            }
        }

        // 마지막 행의 최댓값 반환
        int max = dp[height - 1][0];
        for (int i = 1; i <= height - 1; i++) {
            max = Math.max(max, dp[height - 1][i]);
        }

        return max;
    }
}
