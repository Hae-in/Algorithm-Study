import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        boolean forward = true;
        int removedCnt = 0;

        while (!deque.isEmpty()) {
            if (forward) {
                for (int i = 0; i < K - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }

                int out = deque.pollFirst();
                sb.append(out).append('\n');
            } else {
                for (int i = 0; i < K - 1; i++) {
                    deque.offerFirst(deque.pollLast());
                }
                int out = deque.pollLast();
                sb.append(out).append('\n');
            }

            removedCnt++;

            if (removedCnt % M == 0) {
                forward = !forward;
            }
        }

        System.out.print(sb);
    }
}