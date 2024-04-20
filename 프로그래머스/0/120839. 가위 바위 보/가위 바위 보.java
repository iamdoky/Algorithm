import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return rsp.chars()
                    .mapToObj(c -> {
                        if (c == '0') return "5";
                        else if (c == '2') return "0";
                        else return "2";
                  })
                .collect(Collectors.joining());
    }
}