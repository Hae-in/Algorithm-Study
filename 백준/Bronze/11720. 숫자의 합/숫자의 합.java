import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numbers = sc.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
*/
