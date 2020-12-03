package leetcode;

/**
 * @author vega
 * 寻找两个正序数组的中位数
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 */
public class Subject4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int[] nums3 = new int[nums1.length + nums2.length];
        int x = 0;
        while (true) {
            if (i >= nums1.length || j >= nums2.length) {
                break;
            }
            nums3[x++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < nums1.length) {
            nums3[x++] = nums1[i++];
        }
        while (j < nums2.length) {
            nums3[x++] = nums2[j++];
        }

        if (nums3.length % 2 == 0) {
            return (Double.valueOf(nums3[nums3.length / 2]) + Double.valueOf(nums3[nums3.length / 2 - 1])) / 2;
        }
        return Double.valueOf(nums3[nums3.length / 2]);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2}, nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
