class Solution {
    Boolean[][] cache;

    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        cache = new Boolean[len1 + 1][len2 + 1];
        if (len3 != len1 + len2)
            return false;
        return solve(s1, s2, s3, len1, len2, len3, 0, 0, 0);
    }

    public boolean solve(String s1, String s2, String s3, int len1, int len2, int len3, int i, int j, int k) {
        if (k == len3) {
            if (i == len1 && j == len2)
                return true;
            return false;
        }
        if (cache[i][j] != null)
            return cache[i][j];
        if (i == len1)
            return cache[i][j] = s2.charAt(j) == s3.charAt(k) ? solve(s1, s2, s3, len1, len2, len3, i, j + 1, k + 1) : false;
        if (j == len2)
            return cache[i][j] = s1.charAt(i) == s3.charAt(k) ? solve(s1, s2, s3, len1, len2, len3, i + 1, j, k + 1) : false;
        boolean check1 = false;
        boolean check2 = false;
        if (s1.charAt(i) == s3.charAt(k))
            check1 = solve(s1, s2, s3, len1, len2, len3, i + 1, j, k + 1);
        if (s2.charAt(j) == s3.charAt(k))
            check2 = solve(s1, s2, s3, len1, len2, len3, i, j + 1, k + 1);
        return cache[i][j] = check1 || check2;
    }
}