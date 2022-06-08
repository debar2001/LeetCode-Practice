class Solution {
    public int removePalindromeSub(String s) {
        char[] x = s.toCharArray();
        int n = x.length;
        int i = 0;
        int j = n-1;
        
        while(i<j){
            if(x[i] != x[j]){
                return 2;
            }
            i++;
            j--;
        }
        return 1;
    }
}