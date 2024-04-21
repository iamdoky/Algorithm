public class Solution {
    public int solution(int n) {
        
        String str = String.valueOf(n);
        int a = 0;
        
        for (int i = 0; i < str.length(); i++) 
            a = a + Character.getNumericValue(str.charAt(i));
        
        return a;
    }
}