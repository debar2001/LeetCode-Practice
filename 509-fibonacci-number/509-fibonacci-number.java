class Solution {
    public int fib(int n) {

        int prev2 = 0;
        int prev = 1;

        for (int i = 2; i <= n; i++) {
            int cur = prev + prev2;
            prev2 = prev;
            prev = cur;
        }
        if(n==0){
            return prev2;
        }
        return prev;
    }
}