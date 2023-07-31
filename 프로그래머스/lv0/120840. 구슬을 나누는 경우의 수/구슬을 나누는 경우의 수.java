class Solution {
    public int solution(int balls, int share) {
        return fac(balls, share);
    }
    
    private int fac(int balls, int share) {
        if (share == 0 || balls == share) {
            return 1;
        } else {
            return fac(balls - 1, share - 1) + fac(balls - 1, share);
        }
    }
}