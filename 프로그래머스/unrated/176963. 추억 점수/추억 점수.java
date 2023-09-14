class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        //photo와 점수 비교해서 저장하기
        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                //name 확인하기 위해서
                for(int k=0;k<name.length;k++){
                    //photo와 name 이름이 같은 경우
                    if(photo[i][j].equals(name[k])){
                           answer[i] += yearning[k];
                    }    
                }
            }
        }
        
        return answer;
    }
}