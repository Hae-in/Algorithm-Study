import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] visited;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        visited = new boolean[N + 1];

        dfs(0);

        bw.flush();
        bw.close();
    }
    static void dfs(int depth) throws IOException {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                bw.write(arr[i] + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}