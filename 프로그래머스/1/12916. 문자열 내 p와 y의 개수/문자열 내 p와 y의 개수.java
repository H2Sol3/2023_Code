class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        for(int i=0;i<s.length();i++){
            s=s.toLowerCase();
            if(s.charAt(i) == 'p') p++;
            if(s.charAt(i) == 'y') y++;
        }

        if(p != y) answer =false;
        return answer;
    }
}