import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum=0;
        Arrays.sort(numbers); //정렬
        
        for(int i=0;i<numbers.length;i++){ // 길이만큼 반복
           sum+=numbers[i]; //변수에 배열 모든 값 더해주기
        }
        
        answer=45-sum; // 0~9까지의 합은 45. 45에서 sum을 빼주면 없는 숫자의 합이 나온다.
        
        
        return answer;
    }
}