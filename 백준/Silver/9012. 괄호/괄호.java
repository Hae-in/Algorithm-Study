import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String str = sc.next();
            Deque<Character> stack = new ArrayDeque<>();
            boolean valid = true;
            for (char c : str.toCharArray()) {
                if (c == '(') stack.push(c);
                else {
                    if (stack.isEmpty()) { valid = false; break; }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) valid = false;
            System.out.println(valid ? "YES" : "NO");
        }
    }
}