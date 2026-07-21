class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int ans = x;
        int sum = 0;
        
        while (x >= 1) {
            sum += x % 10;  
            x = x / 10;
        }
        
        answer = ans % sum == 0 ? true : false;
        
        return answer;
    }
}