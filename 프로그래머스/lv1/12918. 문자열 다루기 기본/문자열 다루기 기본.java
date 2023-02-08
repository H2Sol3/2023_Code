class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()==4||s.length()==6){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                answer = true;
            }else if(s.charAt(i)=='1'){
                answer = true;
            }else if(s.charAt(i)=='2'){
                answer = true;
            }else if(s.charAt(i)=='3'){
                answer = true;
            }else if(s.charAt(i)=='4'){
                answer = true;
            }else if(s.charAt(i)=='5'){
                answer = true;
            }else if(s.charAt(i)=='6'){
                answer = true;
            }else if(s.charAt(i)=='7'){
                answer = true;
            }else if(s.charAt(i)=='8'){
                answer = true;
            }else if(s.charAt(i)=='9'){
                answer = true;
            }else{
                answer = false;
                return answer;
            }
        }
        
        }else{
            answer = false;
                return answer;
        }
        return answer;
    }
}