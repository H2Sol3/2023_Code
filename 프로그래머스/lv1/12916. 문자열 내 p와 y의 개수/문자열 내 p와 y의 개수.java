class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            String ss = s.toLowerCase();
            if(ss.charAt(i)=='p'){
                p++;
            }else if(ss.charAt(i)=='y'){
                y++;
            }
        }
        if(p == y){
            return true;
        }else{
            return false;
        }

    }
}