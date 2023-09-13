class Solution {
    public String solution(int[] food) {
        String answer = "";
        //1 초과, 2번부터 나눗셈 몫 넣기
        for(int i=1;i<food.length;i++){
            if(food[i] == 1){
                continue;
            }else{
                int index = 0;
                while(index < food[i]/2){
                    answer+=i; 
                    index++;
                }
            }
        } 
        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        answer = answer + "0" + sb;
        return answer;
    }
}