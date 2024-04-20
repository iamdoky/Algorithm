
import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[] solution(String str) {
        
// 		String[] arr = str.replaceAll("[^0-9]", "").split("");
// 		int[] answer = new int[arr.length];
        
//         Arrays.sort(arr);
		
// 		for (int i = 0; i < answer.length; i++)
//             answer[i] = Integer.parseInt(arr[i]);
		
        
//         return answer;
        
        
        
        
        // return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray()
        return Arrays.stream(str.replaceAll("[^0-9]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}