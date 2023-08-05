class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(new String(my_string));
        sb.reverse();
        return sb.toString();
    }
}