import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        // 최대공약수찾고 그 결과랑 다음이랑 찾기
        
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        //2. 최대공약수 찾기
        int tempA = arrayA[0];
        for (int i = 1 ; i < arrayA.length ; i++){
            tempA = gcd(arrayA[i], tempA);
            
            if (tempA == 1)
                break;
        }
        
        int tempB = arrayB[0];
        for (int i = 1 ; i < arrayB.length ; i++){
            tempB = gcd(arrayB[i], tempB);
            
            if (tempB == 1)
                break;
        }
        

        // 나눠지는지 확인 
        if (div(arrayA, tempB)){
            answer = Math.max(answer, tempB);
        }
        
        if (div(arrayB, tempA)){
            answer = Math.max(answer, tempA);
        }
        
        return answer; 
    }
    public int gcd (int a, int b){
        if (a%b == 0) return b;

        else return gcd (b, a%b);
      
    }
    public boolean div (int[] arr, int num){
        for (int a : arr){
            if (a%num == 0)
                return false;
        }
        return true;
    }
}