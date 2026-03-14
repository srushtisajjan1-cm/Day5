package DSA.Linear.Stacks;

import java.util.Stack;

public class ValidParentheses {
    static boolean isValid(String s) {
        //if(s.length() %2 != 0)return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) { //{,(,[,],),}
            if (c == '(' || c == '[' || c == '{') {
                //push opening braces into stack
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.empty();//the string is a valid parenthesis
    }

    static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{]{](}";
        String s3 = " ( ";
        System.out.println(s1+" -> "+ (isValid(s1) ?"Valid" :"Invalid"));
        System.out.println(s2+" -> "+ (isValid(s2) ?"Valid" :"Invalid"));
        System.out.println(s3+" -> "+ (isValid(s2) ?"Valid" :"Invalid"));

    }
}