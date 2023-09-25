class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char c = ' ';
        char[] charArr = my_string.toCharArray();
        
        for(int i=0;i<charArr.length;i++){
            if(i == num1){
                c = charArr[i];
                charArr[i] = charArr[num2];
                charArr[num2] = c;
            }
            answer+=charArr[i];
        }
        
        return answer;
    }
}