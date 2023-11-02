import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt=0;

        int[] arr = new int[8];
        for(int i=0;i<8;i++){
            arr[i] = scan.nextInt();
        }

        int[] copyArr = Arrays.copyOf(arr,8);
        Arrays.sort(copyArr);

        int[] reverseArr = new int[8];
        for(int i=0;i<8;i++){
            reverseArr[i] = copyArr[copyArr.length-i-1];
        }

        if(Arrays.equals(arr,copyArr)){
            System.out.println("ascending");
        }else if(Arrays.equals(arr,reverseArr)){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }

    }
}