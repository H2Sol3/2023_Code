class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[200];
        int index = 1;
        
        for(int i=1;i<=arr.length;i++){
            String str = String.valueOf(i);
            if(!str.contains("3") && i % 3 != 0){
                arr[index] = i;
                index++;
            }
        }
        
        answer = arr[n];
        return answer;
    }
}