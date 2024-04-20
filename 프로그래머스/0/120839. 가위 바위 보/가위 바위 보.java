import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        
        
        return Arrays.stream(rsp.split(""))
            .map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2")
            .collect(Collectors.joining());
        
        
        // return rsp.chars()
        //             .mapToObj(c -> {
        //                 if (c == '0') return "5";
        //                 else if (c == '2') return "0";
        //                 else return "2";
        //           })
        //         .collect(Collectors.joining());
    }
}