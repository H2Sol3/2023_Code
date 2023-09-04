import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
    //    int[] answer;
        int[] std1 = {1, 2, 3, 4, 5};
        int[] std2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] std3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int std1Num = 0;
        int std2Num = 0;
        int std3Num = 0;
        
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0;i<answers.length;i++){
            if(answers[i] == std1[i % std1.length]){
                std1Num++;
            }
            if(answers[i] == std2[i % std2.length]){
                std2Num++;
            }
            if(answers[i] == std3[i % std3.length]){
                std3Num++;
            }
        }
        
        int topScore = Math.max(std1Num, Math.max(std2Num, std3Num));

        if (topScore == std1Num) {
            list.add(1);
        }
        if (topScore == std2Num) {
            list.add(2);
        }
        if (topScore == std3Num) {
            list.add(3);
        }

        return list.stream().mapToInt(i -> i).toArray();
        
    }
}