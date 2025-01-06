import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}