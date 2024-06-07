import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashSet<String> wordSet = new HashSet<>();
        
        wordSet.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String currentWord = words[i];
            String previousWord = words[i - 1];
            
            // 단어의 마지막 글자와 현재 단어의 첫 글자가 일치하지 않거나, 이미 등장한 단어인 경우
            if (previousWord.charAt(previousWord.length() - 1) != currentWord.charAt(0) || wordSet.contains(currentWord)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            
            wordSet.add(currentWord);
        }
        
        return answer;  // 탈락자가 없는 경우
    }
}

/*class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];


        for(int i =0;i<words.length;i++){
            if(i != 0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){//문자가 다를 때
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
            }else{ //중복 문자
                for(int j=0;j<i;j++){
                    if(words[i].equals(words[j])){
                        answer[0] = (i%n)+1;
                        answer[1] = (i/n)+1;
                    }
                }//for
            }//else
            
        }//for
        return answer;
    }
}*/