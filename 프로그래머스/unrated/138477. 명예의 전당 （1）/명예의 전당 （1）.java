import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        //리스트 생성
        ArrayList<Integer> list = new ArrayList<Integer>();
        //k번째까지 리스트 넣고, 정렬(마지막 값은 answer에 넣어주기)
        for(int i=0;i<score.length;i++){
            list.add(score[i]);
            Collections.sort(list); 
            //역순으로 정렬해주기
            Collections.reverse(list);
            if(i == 0){
                answer[i]=list.get(i);    
            }else if(i<k){
                answer[i]=list.get(i);    
            }else{
                answer[i]=list.get(k-1);
            }
            
        }
        
        return answer;
    }
}