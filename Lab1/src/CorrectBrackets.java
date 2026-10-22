import java.util.ArrayDeque;
import java.util.Deque;

public class CorrectBrackets {
    public static boolean balanced(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) { // проходимся по строке в поисках скобок
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') { // если открывающая - идёт в стек
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false; // логично что если закрывающая идет без открывающей то это уже всю задачу делает false
                }
                else {
                    char top = stack.peek(); // посмотрели что наверху стека и теперь проверяем по скобкам корректность

                    if (c == ')' && top != '(') return false;
                    if (c == ']' && top != '[') return false;
                    if (c == '}' && top != '{') return false;

                    stack.pop();
                }

            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
//    public static void main(String[] args) {
//        System.out.println(balanced("[]"));       // true
//        System.out.println(balanced("[](){}"));   // true
//        System.out.println(balanced("[({})]"));   // true
//        System.out.println(balanced("{]"));
//        System.out.println(balanced("({)}"));
//        System.out.println(balanced("("));
//        System.out.println(balanced(")"));
//    }
}


