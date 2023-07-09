class Solution {
    public int solution(String t, String p) {
        int answer = 0;        
        Long numberLong = Long.valueOf(p);
            
        for(int i=0; i<= t.length()-p.length(); i++){
            String str = t.substring(i, i+p.length());
            Long num = Long.valueOf(str);
            if(num <= numberLong)
                answer++;
        }
        
        return answer;
    }
}