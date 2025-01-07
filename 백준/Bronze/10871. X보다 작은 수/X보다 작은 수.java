import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열 크기
        int X = sc.nextInt(); // 주어진 정수
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();
        for(int i = 0; i < N; i++){
            if(arr[i] < X) System.out.print(arr[i] + " ");
        }
    }
}