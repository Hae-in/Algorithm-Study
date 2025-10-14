import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] phone_book = new String[n];

            for (int i = 0; i < n; i++) {
                phone_book[i] = st.nextToken();
            }

            Solution sol = new Solution();
            boolean result = sol.solution(phone_book);
            System.out.println(result ? "true" : "false");
        }
    }
}

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}