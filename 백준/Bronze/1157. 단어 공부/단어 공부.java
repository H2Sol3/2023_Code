import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = ' ';
        int[] arr = new int[26];
        String str = (br.readLine()).toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}