package leetcode;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/2/11 11:37
 */
public class Strings {



    /**
    * @Description: 翻转字符数组 已通过
    * @author liuyi
    * @date 2021/2/11 11:40
    */
    public static void reverseString(char[] s) {
        int length = s.length;
        for (int i = 0; i < (length / 2); i++) {
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - 1 - i] = temp;
        }
    }


    /**
    * @Description: 翻转整数，未通过，卡在需要判断是否在int范围之内，目前有两种方法1. 先编程字符串再parse 2.手动判断
    * @author liuyi
    * @date 2021/2/11 11:59
    */
    public static int reverseInteger(int x) {
        if (x == 0) {
            return 0;
        }
        //去除数字后面的0
        while (x % 10 == 0) {
            x = x /10;
        }
        int result = 0;
        do {
            int temp = x % 10;
            result = result * 10 + temp;
            x = x /10;
        } while (x != 0);
        if (result > Math.pow(2, 31) - 1 || result < -Math.pow(2, 31)) {
            return 0;
        }
        return result;
    }


    public static String longestCommonPrefix(String[] strs) {
        if (ArrayUtils.isEmpty(strs)) {
            return "";
        }
        int minLength = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).get().length();
        Map<String, List<String>> map = Arrays.stream(strs).collect(Collectors.groupingBy(e -> e.substring(0, 1)));
        if (map.size() == strs.length) {
            return "";
        }
        for (String key : map.keySet()) {
            
        }
        return "";
    }


    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        List<Character> newArray = new ArrayList<>();
        for (int i = 0; i< s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stack.push(s.charAt(i));
                newArray.add(s.charAt(i));
            }
        }
        for (int i = 0; i < newArray.size() /2; i++) {
            if(Character.toLowerCase(newArray.get(i)) != Character.toLowerCase(stack.pop())) {
                return false;
            }
        }
        return true;
    }

}
