import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int MAX = 10000;
        boolean[] isComposite = new boolean[MAX + 1];
        isComposite[0] = isComposite[1] = true;
        for (int i = 2; i * i <= MAX; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= MAX; j += i) isComposite[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a = n / 2;
            int b = n / 2;

            while (a > 1) {
                if (!isComposite[a] && !isComposite[b]) {
                    sb.append(a).append(' ').append(b).append('\n');
                    break;
                }
                a--; b++;
            }
        }
        System.out.print(sb.toString());
    }
}
