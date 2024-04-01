class Solution {
    public int solution(int number, int n, int m) {
        
        return drainage(number, n, m) ? 1 : 0;
    }
    
    private boolean drainage(int number, int n, int m) {
        if(number % n == 0 && number % m == 0) {
            return true;
        }
        
        return false;
    }
}