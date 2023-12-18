import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();
        
        if(s.charAt(0) == ')'){
            answer = false;
        }else{
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '('){
                    stack.push("(");
                }else{
                    if(stack.size() == 0){
                        answer = false;
                        break;
                    }
                    
                    stack.pop();
                }
            }
        }
        
        if(stack.size() != 0){
            answer = false;
        }

        return answer;
    }
}