class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma" };
        //일치하는 문자를 공백으로 변경
        for(int i=0;i<babbling.length;i++){
            for(int j=0;j<str.length;j++){
                babbling[i] = babbling[i].replace(str[j]," ");    
            }
        }
        
        //문자 길이가 0이면 ++
        for(int i=0;i<babbling.length;i++){
            if(babbling[i].trim().length() == 0){
                answer++;
            }
        }
        
        return answer;
    }
}