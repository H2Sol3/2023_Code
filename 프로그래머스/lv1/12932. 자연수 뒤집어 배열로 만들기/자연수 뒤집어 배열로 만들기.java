class Solution {
    public int[] solution(long n) {
       
        String s = String.valueOf(n); //문자열로 변환
        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            answer[i] = s.charAt(s.length()-i-1)-48;
        }
        return answer;
    }
}