class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt;
        //약수 구하기
        for(int i=left;i<=right;i++){//left~right
            cnt = 0;
            for(int j=1;j<=right;j++){//약수 구하기
                if(i%j == 0){//약수
                    cnt++;
                }    
            }
            if(cnt % 2 == 0){
                answer+=i;
            }else{
                answer-=i;
            }
            
        }
        
        return answer;
    }
}