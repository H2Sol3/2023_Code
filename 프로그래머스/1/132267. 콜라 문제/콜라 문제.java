class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //빈 병이 a보다 클 때까지
        while(n >= a){
            //마트한테 받은 콜라
            int cola = (n/a) * b;
            answer += cola;
            //마트 주고 남은 빈 병
            int bottle = n % a;
            //남은 빈 병과 받은 콜라
            n = bottle + cola;
        }
        
        return answer;
    }
}