import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 공을 바꿀 횟수
        int basket[] = new int[N];

        for(int i = 0; i < N; i++){
            basket[i] = i + 1;
        }

        for(int k = 0; k < M; k++){
            // 서로 교환할 바구니 2개
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = temp;
        }

        for(int i = 0; i < N; i++){
            System.out.print(basket[i] + " ");
        }
    }
}