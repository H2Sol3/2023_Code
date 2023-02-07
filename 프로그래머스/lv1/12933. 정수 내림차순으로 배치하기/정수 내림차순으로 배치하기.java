import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String s2="";
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i)-48;
            answer+=arr[i];
        }
        Arrays.sort(arr);
        
        int[] arr2=new int[s.length()];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[arr2.length-i-1];
            s2+=arr2[i];
        }
        System.out.print(s2);
        answer = Long.parseLong(s2);
        return answer;
    }
}