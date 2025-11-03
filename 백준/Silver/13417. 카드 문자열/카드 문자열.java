import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            ArrayDeque<Character> deque = new ArrayDeque<>();

            if (st.hasMoreTokens()) {
                deque.offer(st.nextToken().charAt(0));
            }

            for (int i = 1; i < N; i++) {
                if (!st.hasMoreTokens()) break;
                char current = st.nextToken().charAt(0);

                if (current <= deque.peekFirst()) {
                    deque.offerFirst(current);
                } else {
                    deque.offerLast(current);
                }
            }

            while (!deque.isEmpty()) {
                sb.append(deque.pollFirst());
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}