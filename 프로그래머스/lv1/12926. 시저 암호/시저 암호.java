class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] != ' '){
                if(s.charAt(i) <= 122 && s.charAt(i)+n > 122){//소문자
                    int num =(s.charAt(i)+n)-122;
                    answer += (char)(96+num);
                }else if(s.charAt(i) <= 90 && s.charAt(i)+n > 90){//대문자
                    int num =(s.charAt(i)+n)-90;
                    answer += (char)(64+num);
                }else{
                    answer += (char)(s.charAt(i)+n);    
                }
                
            }else{//공백
                answer += " ";
            }
        }
        return answer;
    }
}