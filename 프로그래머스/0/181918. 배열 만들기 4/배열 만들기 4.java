import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(stack.isEmpty() || stack.peek() < arr[i]){
                stack.push(arr[i]);
            }else{
                 while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                    stack.pop();
                }
                stack.push(arr[i]);
            }
        }
        
        int[] stk = new int[stack.size()];
        
        for(int i=stk.length-1;i>=0;i--){
            stk[i] = stack.pop();
        }
        
        return stk;
    }
}