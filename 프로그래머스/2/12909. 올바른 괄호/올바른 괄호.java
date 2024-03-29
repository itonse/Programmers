import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack stack = new Stack();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}