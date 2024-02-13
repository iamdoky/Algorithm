import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        
		int kim = Arrays.asList(seoul).indexOf("Kim");

        
        return String.format("김서방은 %d에 있다", kim);
    }
}