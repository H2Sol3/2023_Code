class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for(long i=1;i<=n;i++){ //제곱근을 찾을때까지 돌리기
            if(i*i == n){// 제곱한 숫자와 n이 동일하면
                answer = (i+1)*(i+1); //제곱 해주기
                return answer;
            }
        }
        
        return -1;
    }
}