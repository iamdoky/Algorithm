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
        
        
        return countByP == countByY ? true : false;
    }
}


 // return Arrays.stream(str.replaceAll("[^0-9]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();