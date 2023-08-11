import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String binary = Integer.toBinaryString(n); //2진수 변환
        int cnt = 0;
        //1개수 확인
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i) == '1'){
                cnt++;
            }
        }
        //다음으로 큰 숫자 확인
        for(int i=n+1;i<=1000000;i++){
            int cnt2 = 0;
            String binary2 = Integer.toBinaryString(i);
            for(int j=0;j<binary2.length();j++){
                if(binary2.charAt(j) == '1'){
                    cnt2++;
                }
            }
            if(cnt == cnt2){
                return i;
            }
        }
        
        return answer;
    }
}