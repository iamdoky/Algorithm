import java.util.stream.IntStream;  

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, (int) Math.sqrt(n))
                              .filter(a -> n % a == 0)
                              .map(a -> (a == n / a) ? 1 : 2)
                              .sum();

        // return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
