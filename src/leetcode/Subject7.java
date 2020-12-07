package leetcode;

/**
 * @author vega
 * 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class Subject7 {
    public static int reverse(int x) {
        if (x==0){
            return 0;
        }
        boolean fu=false;
        if (x<0){
            x=-x;
            fu=true;
        }
        String s= String.valueOf(x);
        char[] chars=s.toCharArray();
        int i=0,j=s.length()-1;
        while (i<j){
            char c=chars[i];
            chars[i++]=chars[j];
            chars[j--]=c;
        }
        int n=0;
        while (chars[n]==0){
            n++;
        }
        String resultStr=String.valueOf(chars).substring(n);
        try {
            return fu==true?Integer.valueOf("-"+resultStr):Integer.valueOf(resultStr);
        }catch (NumberFormatException e){
            return 0;
        }
    }


    public static int reverse1(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
    public static void main(String[] args) {
        int x=1234567899;
        System.out.println(reverse(x));
    }
}
