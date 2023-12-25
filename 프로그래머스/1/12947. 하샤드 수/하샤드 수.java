class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        String s = String.valueOf(x);
        for(int i=0;i<s.length();i++){
            num += s.charAt(i)-48;
        }
        if(x%num == 0){
            answer = true;
        }else answer = false;
        return answer;
    }
}