import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int lastValue = 0;

        for(int i=0;i<n;i++){
            String str = br.readLine();
            String[] arr = str.split(" ");

            switch (arr[0]){
                case "push":
                    queue.add(Integer.parseInt(arr[1]));
                    lastValue = Integer.parseInt(arr[1]);
                    break;

                case "pop":
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(queue.peek());
                        queue.remove();
                    }
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    if(queue.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;

                case "front":
                    if(!queue.isEmpty()){
                        System.out.println(queue.peek());
                    }else{
                        System.out.println(-1);
                    }
                    break;

                case "back":
                    if(!queue.isEmpty()){
                        System.out.println(lastValue);
                    }else{
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}