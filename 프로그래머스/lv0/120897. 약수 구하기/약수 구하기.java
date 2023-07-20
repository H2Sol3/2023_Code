class Solution {
    public int[] solution(int n) {
        int[] answer;
        int num = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                num++;
            }
        }
        
        answer = new int[num];
        num = 0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
              answer[num] = i;
              num++;
            }
        }
        return answer;
    }
}