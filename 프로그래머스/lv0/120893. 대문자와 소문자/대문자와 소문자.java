class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z'){
                answer += my_string.toUpperCase().charAt(i);
            }else{
                answer += my_string.toLowerCase().charAt(i);
            }
        }
        return answer;
    }
}