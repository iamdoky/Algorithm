import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
    
//         int arr1Length = arr1.length;
//         int arr2Length = arr2.length;
//         int arr1Sum = Arrays.stream(arr1).sum();
//         int arr2Sum = Arrays.stream(arr2).sum();
        
//         if(arr1Length == arr2Length) {
//             if (arr1Sum == arr2Sum) return 0;
            
//             return arr1Sum > arr2Sum ? 1 : -1;
//         }
        
//         return arr1Length > arr2Length ? 1 : -1;
        
    
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0)
            return Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());

        return answer;
    }
    
}