import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        sb.append((int) Math.pow(2, n) - 1).append('\n');
        hanoi(n, 1, 3, 2);
        System.out.print(sb);
    }

    static void hanoi(int 원반수, int 시작기둥, int 목표기둥, int 보조기둥) {
        if (원반수 == 1) {
            sb.append(시작기둥).append(' ').append(목표기둥).append('\n');
            return;
        }

        hanoi(원반수 - 1, 시작기둥, 보조기둥, 목표기둥);
        sb.append(시작기둥).append(' ').append(목표기둥).append('\n');
        hanoi(원반수 - 1, 보조기둥, 목표기둥, 시작기둥);
    }
}