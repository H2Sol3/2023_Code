class Solution {
    public String solution(int n) {
        String answer = "";
        char su = '수';
        char bak = '박';
        
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                answer+=su;
            }else{
                answer+=bak;
            }
        }
        return answer;
    }
}