import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
   //     int max=Math.max(Math.max(sides[0],sides[1]),sides[2]);   
   //     for(int i=0;i<sides.length;i++){
   //         if(sides[i]!=max){
   //             answer+=sides[i];
   //         }
   //     }
        
   //     if(answer>max){
   //         return 1;
   //     }else{
   //         return 2;
   //     }
        
        
        Arrays.sort(sides);
        
        if( sides[2] < (sides[0] + sides[1]) ) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        
        return answer;
        
    }
}