class Solution {
    public String solution(int n) {
        String answer = "";
        char s = '수';
        char b = '박';
        
      for(int i=1;i<=n;i++){
          if(i%2 == 1){
              answer += s;
          }else{
              answer+= b;
          }
      }
        
        return answer;
    }
}