package leetcode;

/**
 * @author shuxiahua
 * @Description: 寻找两个字符串的最长公共子序列并返回其长度
 * @date 2021/4/3 22:00
 */
public class No1143 {

    /**
     * @Description: 错误解法，忽略了最长的，需要用动态规划解
     * @author liuyi
     * @date 2021/4/4 11:31
     */
    public static int longestCommonSubsequence(String text1, String text2) {
        int index = 0, count = 0;
        for (int i = 0; i< text1.length(); i++ ) {
            int result = findCharFromIndex(text2, text1.charAt(i), index);
            if ( result > -1) {
                count++;
                index = result + 1;
            }
        }
        return count;
    }


    private static int findCharFromIndex(String text, char x, int index) {
        while (index < text.length()) {
            if (text.charAt(index) == x) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        longestCommonSubsequence("oxcpqrsvwf", "shmtulqrypy");
    }
}
