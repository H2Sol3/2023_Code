class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            String str = my_string.charAt(i)+"";
            if(!str.equals(letter)){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}