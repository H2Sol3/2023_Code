class Solution {
    public int solution(String my_string) {
        
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        for(int i=0;i<str.length;i++){
            //연산자
            if(i % 2 != 0){
                if(str[i].equals("+")) answer += Integer.parseInt(str[i+1]);
                else answer -= Integer.parseInt(str[i+1]);
            }
        }
        return answer;
    }
}