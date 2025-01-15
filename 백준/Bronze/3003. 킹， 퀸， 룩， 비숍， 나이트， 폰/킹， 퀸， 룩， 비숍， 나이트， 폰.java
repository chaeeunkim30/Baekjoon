import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int origin[] = {1, 1, 2, 2, 2, 8};
        int arr[] = new int[6];

        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(origin[i] == arr[i]) System.out.print(0 + " ");
            else if(origin[i] > arr[i]) System.out.print((origin[i] - arr[i]) + " ");
            else System.out.print("-" + (arr[i] - origin[i]) + " ");
        }
    }
}