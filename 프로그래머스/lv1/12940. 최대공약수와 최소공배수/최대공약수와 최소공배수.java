import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer=new int[2];
        int mul = n * m;
        //최대공약수
        while(n != 0){
            int tmp1 = m % n; //큰 수를 작은 수로 나누기
            m = n;
            n = tmp1;
        }
        answer[0] = m;
        
        //최소공배수
  /*      while(m != 0){
            int tmp2 = n % m;
            n = m;
            m = tmp2;
        } */
        answer[1] = mul / answer[0];
        return answer;
    }
}