class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder(new String(my_string.substring(s,e+1)));
        sb.reverse();
        
        for(int i=0;i<my_string.length();i++){
            if(i != s){
                answer += my_string.charAt(i);
            }else{
                answer += sb.toString();
                i = e;
            }
        }
        return answer;
    }
}