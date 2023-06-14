import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        ArrayList<String> list = new ArrayList();
        int cnt = 0;
        for(int i=0;i<answer.length;i++){
            if(answer[i].length() > 0){
                cnt++;
                list.add(answer[i]);
            }
        }
        String[] answer2 = list.toArray(new String[list.size()]);
       
        return answer2;
    }
}

