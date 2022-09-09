class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int indreq = m+n-1;
        
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[indreq] = nums1[i];
                i--;
                indreq--;
            }
            else if(nums2[j] > nums1[i]){
                nums1[indreq] = nums2[j];
                j--;
                indreq--;
            }
            else{
                nums1[indreq] = nums1[i];
                nums1[indreq-1] = nums2[j];
                i--; 
                j--;
                indreq -= 2;
            }
        }
        
        while(j>=0){
            nums1[indreq] = nums2[j];
            j--; 
            indreq--;
        }
    }
}