import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");

            switch (arr[0]){
                case "push":
                    stack.push(Integer.parseInt(arr[1]));
                    break;

                case "pop":
                    if(stack.empty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.peek());
                        stack.pop();
                    }
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    if(stack.empty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;

                case "top":
                    if(stack.empty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.peek());
                    }
            }
        }
    }
}