import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ",-1);
        
        System.out.println(Arrays.toString(str)); 
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                if(j%2==0){
                    answer += str[i].toUpperCase().charAt(j);
                }else{
                    answer += str[i].toLowerCase().charAt(j);
                }
            }
            
            if(i != str.length-1){
                answer+=" ";
            }
            
        }
               
        return answer;
    }
}