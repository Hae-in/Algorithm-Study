import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<String> serials = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            serials.add(br.readLine());
        }
        serials.sort((a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            int sumA = sumDigits(a);
            int sumB = sumDigits(b);

            if (sumA != sumB) {
                return sumA - sumB;
            }

            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();

        for (String s : serials) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }

    private static int sumDigits(String s) {
        int sum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum = sum + (c - '0');
            }
        }
        return sum;
    }
}
