import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] c = new char[strings.length];
        ArrayList<String> list = new ArrayList();
    
        for(int i=0;i<strings.length;i++){
            c[i] = strings[i].charAt(n);
            list.add(c[i]+strings[i]);
        }
        
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++){
            String str = list.get(i).substring(1);
            list.set(i, str);
        }
        return list.toArray(new String[0]);
    }
}