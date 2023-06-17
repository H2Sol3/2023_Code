import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int minus = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        minus = numbers[0] * numbers[1];
        answer = answer > minus ? answer : minus;
        return answer;
    }
}