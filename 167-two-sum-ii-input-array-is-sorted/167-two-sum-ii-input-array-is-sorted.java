class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] m = new int[2];
        int l = 0;
        int r = numbers.length - 1;
        while(l<r){
            if((numbers[l] + numbers[r]) > target){
                r --;
            }
            else if((numbers[l] + numbers[r]) < target){
                l++;
            }
            else{
                m[0] = l+1;
                m[1] = r+1;
                l++;
                r--;
            }
        }
       return m; 
    }
}