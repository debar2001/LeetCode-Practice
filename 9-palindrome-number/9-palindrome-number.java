class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right)
        {
            if(ch[left] == ch[right])
            {
                left++;
                right--;
            }
            else
                return false;
        }
        return true;
    }
}