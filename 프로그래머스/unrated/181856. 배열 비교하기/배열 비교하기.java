class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        
        for(int i=0;i<arr1.length;i++){
            num1 += arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
           num2 += arr2[i];
        }
        
        if(arr1.length != arr2.length){
            return arr1.length > arr2.length ? 1 : -1;
        }else{
            return num1 > num2 ? 1 : (num1 < num2 ? -1 : 0);
        }
        
    }
}