class Solution {
    public int[] solution(int startNum, int endNum) {
        int arraySize = (endNum - startNum) + 1;
        int[] answer = new int [arraySize];
        
        for (int i = 0; i < arraySize; i++) {
            int a = startNum;
            answer[i] = a;
            startNum++;
        }
        
        return answer;
    }
}