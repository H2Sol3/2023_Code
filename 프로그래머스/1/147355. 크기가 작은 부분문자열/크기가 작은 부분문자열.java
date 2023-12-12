class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length();
        
        for(int i=0;i<=length;i++){
            String str = t.substring(i,p.length()+i);
            long strInt = Long.parseLong(str);
            long pInt = Long.parseLong(p);
            
            if(strInt <= pInt){
                answer++;
            }
        }
        return answer;
    }
}