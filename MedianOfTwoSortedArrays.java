public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0, right = 0, median = 0;
        int lengthOfMergedArray = nums1.length + nums2.length;

        for(int i = 0; i < (lengthOfMergedArray/2 + 1); i++){
            if(nums1[left] <= nums2[right]){
                left ++;
            }
            if(nums1[left] > nums2[right]){
                right ++;
            }
        }


        return median;
    }

    public static void main(String[]args){
        System.out.println();
    }
}
