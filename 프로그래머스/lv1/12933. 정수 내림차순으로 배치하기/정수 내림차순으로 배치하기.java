import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        long[] arr = new long[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-48;
        }
        Arrays.sort(arr);
        String ss = "";
        for(int i=0;i<s.length();i++){
            ss+=arr[s.length()-i-1];
        }
        answer = Long.parseLong(ss);
        return answer;
    }
}