package leetcode;

/**
 * @author vega
 * 最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */
public class Subject5 {
    /**
     * 中心扩散法
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if ("".equals(s)) {
            return "";
        }
        String longestStr = String.valueOf(s.charAt(0));
        String str = "";
        for (int sameStart = 0; sameStart < s.length(); sameStart++) {
            int sameEnd = sameStart;
            while (sameEnd < s.length() && s.charAt(sameEnd) == s.charAt(sameStart)) {
                sameEnd++;
            }
            sameEnd--;
            int m = 1;
            for (; sameStart - m >= 0 && sameEnd + m < s.length(); m++) {
                if (s.charAt(sameEnd + m) != s.charAt(sameStart - m)) {
                    break;
                }
            }
            longestStr = longestStr.length() > (str = s.substring(sameStart - m + 1, sameEnd + m)).length() ? longestStr : str;
        }
        return longestStr;
    }

    public static void main(String[] args) {
        String s = "aaab";
        System.out.println(longestPalindrome(s));
    }
}
