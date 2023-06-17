class Solution {
    public String[] solution(String[] names) {
        int length = 0;
        if(names.length%5 == 0){
            length = names.length/5;    
        }else length = (names.length/5)+1;
        
        String[] answer = new String[length];
        int index = 0;
        for(int i=0;i<names.length;i+=5){
            answer[index] = names[i];
            index++;
        }
        return answer;
    }
}