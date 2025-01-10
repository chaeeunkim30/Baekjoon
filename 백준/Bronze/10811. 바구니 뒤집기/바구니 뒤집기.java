import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int basket[] = new int[N];
        for(int i = 0; i < N; i++) basket[i] = i + 1;
        int M = sc.nextInt();

        for(int n = 0; n < M; n++){
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            for(int k = i; k <= j; k++, j--){
                int temp = basket[k];
                basket[k] = basket[j];
                basket[j] = temp;
            }
        }

        for(int i = 0; i < N; i++) System.out.print(basket[i] + " ");
    }
}