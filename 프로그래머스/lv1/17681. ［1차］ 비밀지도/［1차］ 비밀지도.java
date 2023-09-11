class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            String map = "";
            String binary1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            
            for(int j=0;j<n;j++){
                if(binary1.charAt(j) == '0' && binary2.charAt(j) == '0'){
                    map+=" ";
                }else{
                    map+="#";
                }
            }
            answer[i] = map;
        }
        
        
        return answer;
    }
}