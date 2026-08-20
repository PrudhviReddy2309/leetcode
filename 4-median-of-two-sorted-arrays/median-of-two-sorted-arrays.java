class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] merged = new int[nums1.length + nums2.length];
        
        int i = 0, j = 0, k = 0;
        
        // Merge both sorted arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        
        // Add remaining elements of nums1
        while (i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        
        // Add remaining elements of nums2
        while (j < nums2.length) {
            merged[k++] = nums2[j++];
        }
        
        int n = merged.length;
        
        // Odd number of elements
        if (n % 2 == 1) {
            return merged[n / 2];
        }
        
        // Even number of elements
        return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
    }
}