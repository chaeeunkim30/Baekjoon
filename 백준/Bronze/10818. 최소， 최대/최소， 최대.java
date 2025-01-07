import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < -1000000 && arr[i] > 1000000) return;
        }
        int min = arr[0], max = arr[0];

        for(int i = 0; i < N; i++){
            if(arr[i] > max) max = arr[i];
            else if(arr[i] < min) min = arr[i];
        }

        System.out.print(min + " " + max);
    }
}