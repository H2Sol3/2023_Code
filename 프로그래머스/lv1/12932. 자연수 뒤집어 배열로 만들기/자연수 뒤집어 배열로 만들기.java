class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String s = String.valueOf(n); //0 = -48
        answer = new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
			answer[i]=s.charAt(s.length()-1-i)-48;
			System.out.println(answer[i]);
		}
        return answer;
    }
}