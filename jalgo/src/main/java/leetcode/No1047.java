package leetcode;

import java.util.Stack;

/**
 * @author shuxiahua
 * @Description: 删除字符串中的所有相邻重复项
 * @date 2021/3/9 20:15
 */
public class No1047 {
    /**
     * @Description: v1 主要的性能损耗应该在栈的装拆箱上
     * @update 性能损耗主要存在于Stack上，stack是一个线程安全的集合，比较慢，不建议使用了
     * @author liuyi
     * @date 2021/3/9 20:32
     */
    public String removeDuplicates(String S) {
        if (S.length() == 0) {
            return "";
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<S.length(); i++) {
            if (stack.empty() || stack.peek() != S.charAt(i)) {
                stack.push(S.charAt(i));
            } else {
                stack.pop();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }


    /**
     * 自己维护一个栈,没有装箱和开箱操作，快很多
     * @param S
     * @return
     */
    public String removeDuplicatesV2(String S) {
        if (S.length() == 0) {
            return "";
        }
        StringBuilder stack = new StringBuilder();
        int top = -1;
        for(int i = 0; i<S.length(); i++) {
            char x = S.charAt(i);
            if (top < 0 || stack.charAt(top) != x) {
                stack.append(x);
                top++;
            } else {
                stack.deleteCharAt(top);
                top--;
            }
        }
        return stack.toString();
    }
}
