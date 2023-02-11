class Solution {
    public int solution(int num) {
        int answer = 0;
        int count=1;
        long num2 = num;
        
        
        for(int i =0;i<500;i++){
            if(num2==1){
                 break;
            }else if(num2 % 2==0){
                    num2/=2;
                    answer = count++;
                }else{
                    num2=num2*3+1;
                    answer = count++;
                }
            
        }
        if(count>=500){
            answer=-1;
        }
        
        
        return answer;
    }
}