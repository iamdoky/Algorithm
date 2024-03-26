class Solution {
    public String solution(String str, int s, int e) {

        String sub = str.substring(s, e + 1);
        StringBuffer sb = new StringBuffer(sub);
        String reversedStr = sb.reverse().toString();
    
        return str.replaceAll(sub, reversedStr);
    }
}