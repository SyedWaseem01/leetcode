import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int nums1[] = {1,3};
        int nums2[] = {2};
        double arr3 = findMedianSortedArrays(nums1, nums2);
            System.out.print(arr3);
    }
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] nums3 = new int[nums1.length+nums2.length];
            int i;
            for(i=0;i<nums1.length;i++)
            {
                nums3[i] = nums1[i];
            }
            for(int j=0;j<nums2.length;j++)
            {
                nums3[j+i] = nums2[j];
            }
            Arrays.sort(nums3);
            if(nums3.length%2!=0)
            {
                int x = nums3.length/2;
                return nums3[x];
            }
            else
            {
                int y = nums3.length/2;
                int z = y-1;
                return ((nums3[y]+nums3[z])/2);
            }
        }
}
