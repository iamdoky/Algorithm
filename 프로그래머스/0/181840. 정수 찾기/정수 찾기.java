class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
        for (int num : num_list) {
            if (num == n) {
                answer = 1;
                return answer;
            }
        }
        
        return answer;
    }
}