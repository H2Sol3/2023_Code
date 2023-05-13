class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum =0;
        for(int i=0;i<numbers.length;i++){
            answer += numbers[i];
        }
        for(int i=0;i<=9;i++){
            sum += i;
        }
        answer = sum - answer;
        return answer;
    }
}