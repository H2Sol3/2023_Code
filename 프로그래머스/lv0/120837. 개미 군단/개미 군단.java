class Solution {
    public int solution(int hp) {
        int answer = 0;
        int j_ant = 5;
        int b_ant = 3;
        int i_ant = 1;
        
        if(hp>=j_ant){
            answer = hp/j_ant;
            hp = hp%j_ant;
        }
        if(hp>=b_ant){
            answer += hp/b_ant;
            hp = hp%b_ant;
        }
        if(hp>=i_ant){
            answer += hp/i_ant;
        }
        
        return answer;
    }
}