class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
  
        for(int i=0;i<n;i++){ //x를 n개만큼 곱셈
            //int로 하면 오류가 나옴. 형변환 해주기
            answer[i]=x*((long)i+1);//x*1이 되어야 [0]에 값이 제대로 들어감. +1해주기
        }
        
        return answer;
    }
}