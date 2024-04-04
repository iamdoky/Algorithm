class Solution {
    public int solution(int a, int b) {
        
        int answer = 0;
        
        String result1 = a + "" + b ;
        String result2 = b + "" + a ;
        
        if (Integer.parseInt(result1) > Integer.parseInt(result2)) 
            return Integer.parseInt(result1);
        
        return Integer.parseInt(result2);
    }
}