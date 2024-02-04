import java.util.*;


class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i=0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            answer += Character.isLowerCase(ch) ? 
                        String.valueOf(ch).toUpperCase() :
                        String.valueOf(ch).toLowerCase();
        }
        
        
        return answer;
    }
}