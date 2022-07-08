class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        int i = 0;
        int j = 0;
        while((i<n)&&(j<m)){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==n){
            return true;
        }
        else{
            return false;
        }
    }
}