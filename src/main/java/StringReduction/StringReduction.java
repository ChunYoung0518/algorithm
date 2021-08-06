package StringReduction;

import java.util.Stack;

public class StringReduction {

    public static int reductByUsingStack(String a) {
        int sum = 'a' + 'b' + 'c';
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            while (!stack.empty()) {
                char top = stack.peek();
                if (top == c)
                    break;
                else {
                    char popped = stack.pop();
                    c = (char) (sum - c - popped);
                }
            }
            stack.push(c);
        }
        return stack.size();
    }

    private static String replace(String str) {
        return str.replaceFirst("ab", "c").replaceFirst("ac", "b").
                replaceFirst("ba","c").replaceFirst("bc", "a").
                replaceFirst("ca", "b").replaceFirst("cb", "a");
    }

    public static int reductByUsingLoop(String a) {
        String res = a;
        String origin = a;
        do{
            origin = res;
            res = replace(a);
        }while(!res.equals(origin));
        return res.length();
    }

}
