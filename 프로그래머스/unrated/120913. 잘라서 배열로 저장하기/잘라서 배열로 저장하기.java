import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < my_str.length(); i += n) {
            // 문자열을 n 길이로 자르기
            if (i + n <= my_str.length()) {
                list.add(my_str.substring(i, i + n));
            } else {
                list.add(my_str.substring(i)); // 나머지 문자열 추가
            }
        }
        
        // ArrayList를 배열로 변환
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        
        return answer;
    }
}
