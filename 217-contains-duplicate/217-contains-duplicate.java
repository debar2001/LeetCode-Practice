class Solution {
    public boolean containsDuplicate(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size()==nums.length){
            return false;
        }
        return true;
    }
}