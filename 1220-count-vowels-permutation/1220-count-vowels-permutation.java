class Solution {
    // a=0, e=1, i=2, o=3, u=4
	// Mapping a->e 
			   // e->a,i
			   // i->a,e,o,u
			   // o-> i,u
			   // u->a
    int[][] canGo = {{1},{0,2},{0,1,3,4},{2,4},{0}}; 
    int MOD = 1000000007;
    public int helper(int n, int prev, Integer[][] dp){
        if(n==0)
            return 1;
        if(dp[n][prev] != null)
            return dp[n][prev];
        int sum = 0;
		// From previous vowel try all possible vowels that can come next
        for(int i: canGo[prev]){
            sum = (sum%MOD +helper(n-1,i,dp)%MOD)%MOD;
        }
        return dp[n][prev] = sum;
    }
    public int countVowelPermutation(int n) {
        int ans = 0;
        Integer[][] dp = new Integer[n][5];
        for(int i=0;i<5;i++){ // Start with all possibilities i.e. a, e, i, o, u
            ans = (ans + helper(n-1,i,dp))%MOD;
        }
        return ans;
    }
}