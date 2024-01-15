import java.util.*;
class Solution {
    
    public boolean isPrime(int sum){
        for(int i=2;i<sum;i++){
            if(sum % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){    
                    int sum = nums[i]+nums[j]+nums[k];
                    if(isPrime(sum)){
                        answer++;
                    }
              //      list.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        
   /*     for(int i=0;i<list.size();i++){
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
        }*/

        return answer;
    }
}