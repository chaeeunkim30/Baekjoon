import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int basket[] = new int[N];

        for(int m = 0; m < M; m++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int n = i - 1; n < j; n++){
                basket[n] = k;
            }
        }

        for(int num = 0; num < N; num++){
            System.out.print(basket[num] + " ");
        }
    }
}