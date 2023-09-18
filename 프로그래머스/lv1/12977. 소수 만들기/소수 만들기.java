import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        //반복문 3개
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){        
                    list.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            int cnt =0;
            for(int j=2;j<list.get(i);j++){
                if(list.get(i) % j == 0){
                    break;
                }else{
                    cnt++;
                }
            }
            if(cnt == list.get(i)-2){
                answer++;
            }
        }

        return answer;
    }
}