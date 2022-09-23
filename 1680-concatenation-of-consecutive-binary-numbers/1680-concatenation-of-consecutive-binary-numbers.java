class Solution {
    public int concatenatedBinary(int n) {
        // int ans = 0;
        // for(int i=1; i<=n; i++){
        //     ans = ((ans << (1+(int)(Math.log(i)/Math.log(2))))%1000000007 + i)%1000000007;
        // }
        // return ans;
        final long modulo = (long) (1e9 + 7);
        long result = 0;
        int binaryDigits = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) binaryDigits++;
            result = ((result << binaryDigits) + i) % modulo;
        }
        return (int) result;
    }
}