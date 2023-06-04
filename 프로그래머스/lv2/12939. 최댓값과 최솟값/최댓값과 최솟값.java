import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" "); //공백을 기준으로 나눠주기. -도 문자열로 들어가기때문에 나눠주는 것.
        int[] arr = new int[str.length];
        for(int i=0;i<arr.length;i++){
            int num = Integer.parseInt(str[i]);
            arr[i] = num;
        }
        Arrays.sort(arr);
        
        int min_num = arr[0];
        int max_num = arr[arr.length-1];
        
        answer = String.valueOf(min_num) + " " + String.valueOf(max_num);
        return answer;
    }
}