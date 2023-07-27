class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        if(common[1]-common[0] == common[2]-common[1]){
            int num1 = common[1]-common[0];
            answer = common[common.length-1]+num1;
        }else{
            int num2 = common[1]/common[0];
            answer = common[common.length-1]*num2;
        }
            
        
        return answer;
    }
}