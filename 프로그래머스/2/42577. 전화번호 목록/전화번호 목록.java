import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        HashMap<String,Integer> map = new HashMap<>();
        
        //전화번호 넣기
        for(String phone : phone_book){
            map.put(phone, 0);
        }
        
        //전화번호 확인하기
        for(int i=0;i<phone_book.length;i++){
            for(int j=0;j<phone_book[i].length();j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    answer = false;
                }
            }
        }
        
        return answer;
    }
}