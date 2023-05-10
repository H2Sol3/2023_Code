class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        int c = 0;
        
        if(s.length() != 4 && s.length() != 6){
            return false;
        }else{
            for(int i =0;i<s.length();i++){
                if(s.charAt(i) - 48 <= 9){
                    num++;
                }else c++;
            }
            if(s.length() == num){
                answer = true;
            }else if(s.length() == c){
                answer = true;
            }else{
                answer = false;
            }
            return answer;
        }
    }
}