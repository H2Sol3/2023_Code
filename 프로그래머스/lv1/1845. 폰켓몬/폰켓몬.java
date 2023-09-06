import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet();
        
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        
        answer = set.size() > nums.length/2 ? nums.length/2 : set.size();
        return answer;
    }
}