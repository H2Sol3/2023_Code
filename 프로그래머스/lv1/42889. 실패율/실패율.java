import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        
         int[] answer = new int[N];
        int[] user = new int[N];
        ArrayList<Double> clear = new ArrayList<>();
        
        // 스테이지 별 사용자 구하기
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i + 1 == stages[j]) {
                    cnt++;
                }
            }
            user[i] = cnt;
        }
        
        int length = stages.length;
        
        // 실패율 구하기
        for (int i = 0; i < user.length; i++) {
            if (length == 0) {
                clear.add(0.0);
            } else {
                clear.add((double) user[i] / length);
                length -= user[i];
            }
        }

        // 스테이지를 번호 순으로 정렬
        List<Integer> stageOrder = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            stageOrder.add(i);
        }
        
        // 스테이지를 실패율에 따라 내림차순 정렬
        Collections.sort(stageOrder, (a, b) -> {
            int idx1 = a - 1;
            int idx2 = b - 1;
            double rate1 = clear.get(idx1);
            double rate2 = clear.get(idx2);
            if (rate1 == rate2) {
                return Integer.compare(a, b); // 실패율이 같을 때는 작은 번호가 먼저 오도록 함
            } else {
                return Double.compare(rate2, rate1);
            }
        });

        // 정렬된 스테이지 번호를 answer 배열에 저장
        for (int i = 0; i < N; i++) {
            answer[i] = stageOrder.get(i);
        }
        
 /*       int[] answer = new int[N];
        int[] user = new int[N];
        ArrayList<Double> clear = new ArrayList();
        
        //스테이지 별 사용자 구하기
        for(int i=0;i<N;i++){
            int cnt=0;
            for(int j=0;j<stages.length;j++){
                if(i+1 == stages[j]){
                    cnt++;
                }
            }
            user[i] = cnt;
           
        }
        
        int length = stages.length;
        
        //실패율 구하기
        for(int i=0;i<user.length;i++){
            if(i == 0){
                clear.add((double)user[i]/length);
            }else{
                if(user[i] == 0){
                    clear.add(0.0);
                }else{
                    if(length <=0){
                        length = 1;
                        clear.add((double)user[i]/length);
                    }else{
                        length -= user[i-1];
                        clear.add((double)user[i]/length);
                    }
                    
                }
            }
            
        }

        ArrayList<Double> clear2 = new ArrayList(clear);
        Collections.sort(clear2);
        Collections.reverse(clear2);
        System.out.println(clear);
        //스테이지 리턴하기
        for(int i=0;i<clear.size();i++){
            for(int j=0;j<clear.size();j++){
                if(clear2.get(i).equals(clear.get(j))){
                    answer[i] = j+1;
                    clear.set(j, -1.0);
                    break;
                }
            }
        }        */
        return answer;
    }
}
//System.out.println(clear[i]); System.out.println(clear[i]);
