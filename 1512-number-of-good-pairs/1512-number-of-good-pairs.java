class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int count = map.containsKey(nums[i])? map.get(nums[i]):0;
            map.put(nums[i], count+1);
        }
        int ans = 0;
        for(int value:map.values()){
            if(value > 1){
                ans += (((value)*(value-1))/2);
            }
        }
        return ans;
    }
}