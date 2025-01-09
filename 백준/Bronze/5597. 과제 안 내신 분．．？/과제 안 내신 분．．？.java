import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean std[] = new boolean[31];
        for(int i = 1; i <= 28; i++){
            int num = sc.nextInt();
            std[num] = true;
        }
        for(int i = 1; i <= 30; i++){
            if(!std[i]) System.out.println(i);
        }

    }
}