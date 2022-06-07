class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        i = m-1
        j = n-1
        indexreq = m+n-1
        
        while i>=0 and j>=0:
            if nums1[i] > nums2[j]:
                nums1[indexreq] = nums1[i]
                i -= 1
                indexreq -= 1
            elif nums2[j] >= nums1[i]:
                nums1[indexreq] = nums2[j]
                j -= 1
                indexreq -= 1
            else:
                nums1[indexreq] = nums2[j]
                nums1[indexreq-1] = nums1[j]
                i -= 1
                j -= 1
                indexreq -= 2
        
        while j>=0:
            nums1[indexreq] = nums2[j]
            j -= 1
            indexreq -= 1
        
        # Brute Force Approach
        # if m<1:
        #     nums1[:] = nums2[:n]
        # elif n<1:
        #     nums1[:] = nums1[:m]
        # else:
        #     nums1[:] = sorted(nums1[:m]+nums2[:n])