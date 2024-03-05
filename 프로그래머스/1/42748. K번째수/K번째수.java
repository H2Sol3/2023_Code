import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            int[] subArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            int number = commands[i][2]-1;
            Arrays.sort(subArray);
            answer[i] = subArray[number];
        }
        return answer;
    }
}