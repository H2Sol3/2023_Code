class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=0;i<cipher.length();i++){
            if(i%code-1 == 0){
                answer += cipher.charAt(i);
                System.out.println(i);
            }
        }
        return answer;
    }
}