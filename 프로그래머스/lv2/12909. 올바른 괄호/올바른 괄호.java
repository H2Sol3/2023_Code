class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        
      /*  if(s.charAt(0) == ')'){
            return false;
        }else if(s.charAt(s.length()-1) == '('){
            return false;
        }else if(s.charAt(0) == '('){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '('){
                    left++;
                }else{
                    right++;
                }
            }
        }
        if(left == right){
            answer = true;
        }else{
            answer = false;  
        } */
        
        //----------------------
        
         if(s.charAt(0) == ')'){
            return false;
        }else if(s.charAt(s.length()-1) == '('){
            return false;
        }else if(s.charAt(0) == '('){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '('){
                    num++;
                }else if(s.charAt(i) == ')'){
                    num--;
                }
                
                if(num < 0){
                    return false;
                }
            }
        }

        return num == 0?true:false;
    }
}