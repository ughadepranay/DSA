package string;

//Example 1:
//
//Input: s = "(()())(())"
//Output: "()()()"
//Explanation:
//The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//Example 2:
//
//Input: s = "(()())(())(()(()))"
//Output: "()()()()(())"
//Explanation:
//The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
//Example 3:
//
//Input: s = "()()"
//Output: ""
//Explanation:
//The input string is "()()", with primitive decomposition "()" + "()".
//After removing outer parentheses of each part, this is "" + "" = "".

import java.util.Stack;


public class RemoveOuterMostParanthesis {

    //Solution1:
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        //need to print primitive decomposition
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                //see if stack is not empty onty then you need to append the charater int0 the stringbuldr
                if (!stack.isEmpty()) {
                    str.append(s.charAt(i));
                }
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    str.append(s.charAt(i));
                }
            }
        }

        System.out.println(str);

        System.out.println(removeOuterPara("(()())(())"));
    }


//  We can solve this problem wihtout using stack simply using counter variable to check if stack will be
//  empty or not emptyas follows:

//    Solution2:
    public static String removeOuterPara(String s) {
        StringBuilder str = new StringBuilder("");
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count != 0) {
                    str.append(s.charAt(i));
                }
                count++;
            } else {
                count--;
                if (count != 0) {
                    str.append(s.charAt(i));
                }
            }
        }
        return str.toString();
    }

}
