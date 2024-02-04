class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i=0;i<dic.length;i++){
            int cnt = 0;
            
            if(spell.length == dic[i].length()){
                for(int j=0;j<spell.length;j++){
                    if(dic[i].contains(spell[j])){
                        cnt++;
                    }
                }
                
                if(cnt == spell.length){
                    answer++;
                }
            }
        }
        
        if(answer == 0) answer = 2;
        return answer;
    }
}