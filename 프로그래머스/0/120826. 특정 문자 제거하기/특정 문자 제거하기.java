import java.util.*;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        for (int i=0; i < my_string.length(); i++) {
            String eq = String.valueOf(my_string.charAt(i));
            
            if (!eq.equals(letter)) {
                answer += eq;
            }
        }
        
        
        return answer;
    }
}