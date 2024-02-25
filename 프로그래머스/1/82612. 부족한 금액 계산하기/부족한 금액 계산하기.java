class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long num = 0;
        for(int i=1;i<= count; i++){
            num += price * i;
        }
        if(money > num){
            return 0;
        }else{
            answer = num - money;
            return answer;
        }
        
    }
}