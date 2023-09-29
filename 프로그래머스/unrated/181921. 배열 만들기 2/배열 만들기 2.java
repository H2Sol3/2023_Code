import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList();
        //5 or 0 구분하기
        for(int i=l;i<=r;i++){
            if(fiveOrZero(i)){
                list.add(i);
            }
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }else{
            answer = new int[list.size()];
            for(int i=0;i<answer.length;i++){
                answer[i] = list.get(i);
            }
        }
        
        
        return answer;
    }
    
    //5, 0 구분
    public static boolean fiveOrZero(int num){
        String str = String.valueOf(num);
        char[] charArr = str.toCharArray();
        for(char c : charArr){
            if(c != '0' && c != '5'){
                return false;
            }
        }
        return true;
    }
}