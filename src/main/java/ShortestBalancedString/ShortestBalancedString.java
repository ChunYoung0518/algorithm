package ShortestBalancedString;

import java.util.HashSet;
import java.util.Set;

public class ShortestBalancedString {

    public static int solution(String str) {
        //get all possible substrings from the shortest
        for (int length = 2; length <= str.length(); length++) {
            for (int startIndex = 0; startIndex < str.length() - length + 1; startIndex++) {
                Set<Character> lower = new HashSet<>();
                Set<Character> upper = new HashSet<>();
                //possible strings
                char[] candidate = str.substring(startIndex, startIndex + length).toCharArray();
                for (char ch : candidate) {
                    if (Character.isLowerCase(ch)){
                        lower.add(ch);
                    } else {
                        upper.add(ch);
                    }
                }
                //check if balanced or not
                if (isBalanced(lower, upper)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public static boolean isBalanced(Set<Character> lower, Set<Character> upper) {
        Set<Character> lower1 = new HashSet<>();
        Set<Character> lower2 = new HashSet<>();
        lower.forEach((e) -> {
            lower1.add(Character.toLowerCase(e));
        });
        upper.forEach((e) -> {
            lower2.add(Character.toLowerCase(e));
        });
        return lower1.containsAll(lower2) && lower2.containsAll(lower1);
    }

}
