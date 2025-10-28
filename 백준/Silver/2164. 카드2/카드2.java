import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while(q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }

        int answer = q.poll();
        System.out.println(answer);
    }
}