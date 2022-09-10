class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int top = 0;
        int bottom = 0;
        
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        
        while(top<nums1.length && bottom<nums2.length){
            if(nums1[top] == nums2[bottom]){
                intersection.add(nums1[top]);
                top++;
                bottom++;
            }
            else if(nums1[top] > nums2[bottom]){
                bottom++;
            }
            else if(nums1[top] < nums2[bottom]){
                top++;
            }
        }
        
        int[] ans = new int[intersection.size()];
        for(int i=0; i<intersection.size(); i++){
            ans[i] = intersection.get(i);
        }
        return ans;
    }
}