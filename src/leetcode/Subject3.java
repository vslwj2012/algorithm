package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vega
 * 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Subject3 {
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        //最长字串开始的位置
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                start = start > map.get(chars[i]) + 1 ? start : map.get(chars[i]) + 1;
            }
            max = max > (i - start + 1) ? max : (i - start + 1);
            map.put(chars[i], i);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
