class Solution {
    public int solution(int[] common) {
      int answer = 0;
        //예시처럼 배열 크기가 2는 되야 함
        if((common[1] - common[0]) == (common[2]-common[1])){
            //1. 등차수열인지 확인
            answer = common[common.length-1] + (common[1] - common[0]);
        }else{
            //등차수열 아니면 등비수열이니까 그냥 등비수열로 진행
            answer = common[common.length-1] * (common[1]/common[0]);
        }        
        return answer;
    }
}