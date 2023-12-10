class Solution {
    public long solution(int n) {
        long answer = 0;
        int dp[] = new int[2001];
        
        dp[0] = 1;
        dp[1] = 2;
        
        if(n>=3){
            for(int i=2;i<2001;i++){
                dp[i] = (dp[i-1]+dp[i-2]) % 1234567;
            }
        }
        
        answer= dp[n-1];
        
        
        return answer;
    }
}