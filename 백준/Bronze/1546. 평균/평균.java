import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double exam[] = new double[N];
        double avg, max = 0, sum = 0;

        for(int i = 0; i < N; i++){
            exam[i] = sc.nextInt();

            if(exam[i] > max) max = exam[i];
        }

        for(int i = 0; i < N; i++){
            sum += exam[i] / max * 100;
        }
        avg = sum / N;

        System.out.println(avg);
    }
}