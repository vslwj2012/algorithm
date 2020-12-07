package leetcode;

/**
 * @author vega
 * 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class Subject11 {

    /**
     * 暴力
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            int area = 0;
            for (int j = i + 1; j < height.length; j++) {
                maxArea = (area = (j - i) * Math.min(height[i], height[j])) > maxArea ? area : maxArea;
            }
        }
        return maxArea;
    }

    /**
     * 双指针
     *
     * @param height
     * @return
     */
    public static int maxArea1(int[] height) {
        int maxArea = 0;
        int area = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            maxArea = (area = (j - i) * Math.min(height[i], height[j])) > maxArea ? area : maxArea;
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea1(height));
    }
}
