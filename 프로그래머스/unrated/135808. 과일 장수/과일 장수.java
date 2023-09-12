import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); //score 순서대로 정렬
        
        for(int i=score.length;i>=m;i-=m){
            answer += score[i-m] * m;
        }
        
        return answer;
    }
}