class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {wallpaper.length,wallpaper[0].length(),0,0};
        for(int c=0;c<wallpaper.length;c++){
            for(int r=0;r<wallpaper[0].length();r++){
                if(wallpaper[c].substring(r,r+1).equals("#")){
                    answer[0] = Math.min(answer[0],c);
                    answer[1] = Math.min(answer[1],r);
                    answer[2] = Math.max(answer[2],c);
                    answer[3] = Math.max(answer[3],r);
                }
            }
        }
        answer[2] +=1;
        answer[3] +=1;
        return answer;
    }
}