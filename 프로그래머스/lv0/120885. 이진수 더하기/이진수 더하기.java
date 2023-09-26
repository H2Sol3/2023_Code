class Solution {
    public String solution(String bin1, String bin2) {
        int a = Integer.valueOf(bin1,2)+Integer.valueOf(bin2,2);
        String answer = Integer.toBinaryString(a);
        
        return answer;
    }
}