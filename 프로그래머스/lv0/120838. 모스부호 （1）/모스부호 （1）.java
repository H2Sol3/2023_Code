class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                      "..-","...-",".--","-..-","-.--","--.."};
        String[] split_str = letter.split(" ");
        
        for(int i=0;i<split_str.length;i++){
            for(int j=0;j<morse.length;j++){
                if(split_str[i].equals(morse[j])){
                    answer+=(char)(j+97);
                    break;
                }
            }
        }
        return answer;
    }
}