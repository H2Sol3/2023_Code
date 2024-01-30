class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int mul = 2 * a * b;
        int num = Integer.parseInt(a + "" + b);
        
        answer = num > mul ? num : mul;
        
        return answer;
    }
}