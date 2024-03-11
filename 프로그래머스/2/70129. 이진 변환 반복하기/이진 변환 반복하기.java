class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String binary = s;
        
        while(true){
            int cnt = 0;
            int remove_zero = 0;
            //제거해야 할 0 확인
            for(int i=0;i<binary.length();i++){
                if(binary.charAt(i) == '0'){
                    remove_zero++;       
                }
            }
            
            //변환 후 길이
            int length = binary.length()-remove_zero;
            
            //이진변환
            binary = Integer.toBinaryString(length);
            
            answer[0] += ++cnt;
            answer[1] += remove_zero;
            
            if(binary.equals("1")) break;
        
        }
//        System.out.println(Integer.parseInt(binary));
        return answer;
    }
}