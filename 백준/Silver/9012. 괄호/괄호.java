import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while (n > 0) {
            Stack<String> stack = new Stack<>();
            String str = scan.next();

            for (int i = 0; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));

                if (s.equals("(")) {
                    stack.push(s);
                } else {
                    if (!stack.empty()) {
                        stack.pop();
                    } else {
                        stack.push(s);
                        break;
                    }

                }

            }

            if (!stack.empty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            n--;
        }
    }
}
