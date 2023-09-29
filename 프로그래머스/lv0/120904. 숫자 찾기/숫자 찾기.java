class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = String.valueOf(num);
        for(int i=0;i<str.length();i++){
            String str2 = str.charAt(i)+"";
            String str3 = String.valueOf(k);
            if(str2.contains(str3)){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}