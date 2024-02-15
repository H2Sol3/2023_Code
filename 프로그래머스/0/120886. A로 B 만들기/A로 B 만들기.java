import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        if(before.length() == after.length()){
            int[] arr1 = new int[26];
            int[] arr2 = new int[26];
            
            for(int i=0;i<before.length();i++){
                char c1 = before.charAt(i);
                char c2 = after.charAt(i);
                int num1 = c1 - 97;
                int num2 = c2 - 97;
                arr1[num1]++;
                arr2[num2]++;
            }
            
            if(Arrays.equals(arr1, arr2)){
                answer = 1;
            }
            
            /*
            for(int i : arr1){
                System.out.println(i);
            }
            
            
            HashMap<Character,Integer> map = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();

            for(char c : before.toCharArray()){
                map.put(c, map.getOrDefault(c, 0)+1);
            }

            for(char c : after.toCharArray()){
                map2.put(c, map2.getOrDefault(c, 0)+1);
            }

            for (char c1 : map.keySet()) {
                for (char c2 : map2.keySet()) {
                    System.out.println(c1+": "+map.get(c1)+" "+c2+": "+map2.get(c2));
                    
                    if(c1 != c2 || map.get(c1) != map2.get(c2)){
                        answer = 0;
                    }
                }
                
                if(answer == 0){
                    break;
                }
            }*/
        }else{
            answer = 0;
        }
        
        
        /*
        map.put("a",0);
        map.put("b",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        map.put("a",0);
        */
        
        return answer;
    }
}