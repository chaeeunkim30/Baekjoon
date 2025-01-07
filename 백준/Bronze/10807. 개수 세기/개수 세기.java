import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int v;
        int cnt = 0;
        N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < -100 && arr[i] > 100) break;
        }
        v = sc.nextInt();
        if(v < -100 && v > 100) return;
        for(int i = 0; i < N; i++){
            if(v == arr[i]) cnt++;
        }
        System.out.print(cnt);
    }
}