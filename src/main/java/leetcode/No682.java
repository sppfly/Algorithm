package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class No682 {
    public static int calPoints(String[] ops) {

        Deque<Integer> stack = new LinkedList<>();
        for (String v: ops) {
            switch (v) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(2 * stack.getFirst());
                    break;
                case "+":
                    Integer head = stack.poll();
                    Integer sh = stack.peek();
                    stack.push(head);
                    stack.push(head + sh);
                    break;
                default:
                    stack.push(Integer.valueOf(v));https://github.com/cs186-student/sp22-proj2-username
                    break;
            }
        }
        Integer sum = 0;
        while (!stack.isEmpty()) {
            sum+=stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] l = {"5","2","C","D","+"};
        System.out.println(calPoints(l));
    }
}
