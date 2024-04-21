class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) answer += i;
        
		return answer + n;
        
        // return IntStream
        //     .rangeClosed(1, n)
        //     .parallel()
        //     .filter(i -> n % i == 0)
        //     .sum();
    }
}