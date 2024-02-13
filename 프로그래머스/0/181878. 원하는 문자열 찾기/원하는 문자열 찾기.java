class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        
        if (myString.toLowerCase().contains(pat.toLowerCase())) {
            answer++;
        }
        
        return answer;
    }
}