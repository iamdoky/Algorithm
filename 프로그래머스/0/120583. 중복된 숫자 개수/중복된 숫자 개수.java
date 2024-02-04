import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int a : array) {
            if (n == a) {
                answer++;
            }
        }
        
        return answer;
    }
}