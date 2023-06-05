import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" "); //공백을 기준으로 분리해서 배열에 넣어주기
        if(s.substring(s.length() - 1, s.length()).equals(" ")) { //문자열 마지막에 공백이 있는 경우
            str[str.length-1] += " ";//마지막에 공백 넣어주기
        }
        for(int i=0;i<str.length;i++){//배열 길이만큼
            for(int j=0;j<str[i].length();j++){//배열[i] 문자열 길이만큼
                if(j==0){//0은 맨 앞자리니까 대문자 필요
                    answer += str[i].toUpperCase().charAt(j);
                }else{//나머지는 모두 소문자
                    answer += str[i].toLowerCase().charAt(j);
                }
            }
            if(i != str.length-1){ //마지막 순서가 아닐때만 공백이 필요함
                answer+=" ";
            }
        }
        return answer;
    }
}