import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        ArrayList<String> list = new ArrayList();
        for(int i=0;i<answer.length;i++){
            if(!answer[i].isEmpty()){
                list.add(answer[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}