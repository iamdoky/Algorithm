class Solution {
    public int solution(int hp) {
         
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
        
        
//         int a = hp / 5;
//         hp %= 5;
        
//         a += hp / 3;
//         hp %= 3;
        
//         return a += hp / 1;
    }
}