class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3=s1+s2;
        String s4=s2+s1;
        
        if(Integer.parseInt(s3) > Integer.parseInt(s4)){
            answer = Integer.parseInt(s3);
        }else{
            answer = Integer.parseInt(s4);
        }
        
        return answer;
    }
}