import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cap, s, t, b;
        s = scanner.nextInt();
        t = scanner.nextInt();
        b = scanner.nextInt();
        cap = s * t * b;
        System.out.printf("%d KB", cap);
    }
}
