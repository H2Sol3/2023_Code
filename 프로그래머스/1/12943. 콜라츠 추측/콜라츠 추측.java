class Solution {
    public int solution(int num) {
        int answer = 0;
        long num2 = num;
        if(num2 == 1) return 0;
        
        for(int i=1;i<=500;i++){
            if(num2 != 1){
                if(num2%2==0){ //짝
                    num2=num2/2;
                }else{//홀
                    num2=num2*3+1;
                }
            }else{
                return i-1;
            }
        }
        answer = -1;
        
        return answer;
    }
}