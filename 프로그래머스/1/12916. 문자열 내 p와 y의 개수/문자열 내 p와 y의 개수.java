import java.util.stream.*;

class Solution {
    boolean solution(String s) {
        
        boolean answer = true;
        int countByP = 0;
        int countByY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String a = String.valueOf(s.charAt(i)).toLowerCase();
            
            if (a.equals("p")) countByP++;
            else if (a.equals("y")) countByY++;  
        }
        
        return countByP == countByY;
             
    
//          다른 사람의 풀이 -> 
//         s = s.toUpperCase();
//         return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count()
    }
}
