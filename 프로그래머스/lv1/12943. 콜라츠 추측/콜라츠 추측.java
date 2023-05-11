class Solution {
    public int solution(int num) {
        int answer = 0;
        long num2=(long)num;
        for(int i=1;i<=500;i++){
            if(num2!=1){
                if(num2%2==0){
                    num2=num2/2;
                }else{
                    num2=num2*3+1;
                }
            }else if(num2 == 1){
                answer = i-1;
                break;
            }
            
            if(i == 500){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}