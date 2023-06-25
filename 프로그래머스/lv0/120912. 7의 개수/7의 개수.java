class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = "";
        for(int i=0;i<array.length;i++){
            str+=String.valueOf(array[i]);
        }
        char[] c = str.toCharArray();
        
        for(int i=0;i<c.length;i++){
            if(c[i] == '7'){
                answer++;
            }
        }
        return answer;
    }
}