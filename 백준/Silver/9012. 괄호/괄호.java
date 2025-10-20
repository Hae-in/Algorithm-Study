import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            String str = br.readLine(); // 괄호 문자열 입력
            Stack<Character> stack = new Stack<>();
            boolean isValid = true; // 매 케이스마다 초기화

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else { // ch == ')'
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            // 최종 검증
            if (!stack.isEmpty()) {
                isValid = false;
            }

            System.out.println(isValid ? "YES" : "NO");
        }
    }
}
