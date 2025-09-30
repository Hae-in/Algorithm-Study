import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int k;
    static int[] arr;
    static int[] sel = new int[6];
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int start, int depth) {
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                if (i > 0) sb.append(' ');
                sb.append(sel[i]);
            }
            sb.append('\n');
            return;
        }
        for (int i = start; i < k; i++) {
            sel[depth] = arr[i];
            dfs(i + 1, depth + 1);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        boolean firstCase = true;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.length() == 0) continue;
            StringTokenizer st = new StringTokenizer(line);
            k = Integer.parseInt(st.nextToken());
            if (k == 0) break;
            arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if (!firstCase) sb.append('\n');
            firstCase = false;
            dfs(0, 0);
        }
        System.out.print(sb.toString());
    }
}
