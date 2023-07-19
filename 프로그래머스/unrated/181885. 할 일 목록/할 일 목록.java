class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer;
        String str = "";
        int num = 0;
        for(int i=0;i<todo_list.length;i++){
            if(finished[i] == false){
                num++;
                str += todo_list[i] + " ";
            }
        }
        answer = str.split(" ");
        
        return answer;
    }
}