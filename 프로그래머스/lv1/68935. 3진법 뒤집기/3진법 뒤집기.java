class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n,3); //3진법으로 변환
        StringBuilder sb = new StringBuilder(new String(str)); 
        sb.reverse(); //역순정렬
        str = String.valueOf(sb); //sb를 문자열에 넣기
        answer = Integer.parseInt(str,3); // 10진수로 변환
        return answer;
    }
}