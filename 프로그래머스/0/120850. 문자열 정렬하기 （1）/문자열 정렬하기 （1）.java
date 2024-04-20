
import java.util.Arrays;

class Solution {
    public int[] solution(String str) {
        
		String[] arr = str.replaceAll("[^0-9]", "").split("");
		int[] answer = new int[arr.length];
        
        Arrays.sort(arr);
		
		for (int i = 0; i < answer.length; i++)
            answer[i] = Integer.parseInt(arr[i]);
		
        
        return answer;
    }
}