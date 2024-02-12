class Solution {
    public int solution(int a, int b) {
        String t1 = String.valueOf(a) + String.valueOf(b);
        int t2 = 2 * a * b;
        
        return Integer.valueOf(t1) < t2 ? 
            t2 : 
            Integer.valueOf(t1);
    }
}