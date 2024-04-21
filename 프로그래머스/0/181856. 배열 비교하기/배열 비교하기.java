import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
    
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        
        if(arr1Length == arr2Length) {
            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();
            
            if (arr1Sum == arr2Sum) {
                return 0;
            }
            
            return arr1Sum > arr2Sum ? 1 : -1;
        }
        
        return arr1Length > arr2Length ? 1 : -1;



    }
}