import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int same = 0;
        int result = 0;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a == b && b == c && a == c){
            same = a;
            result = 10000 + same * 1000;
        } else if(a == b || b == c || a == c){
            if(a == b || a == c) same = a;
            else if(b == c) same = b;
            result = 1000 + same * 100;
        } else {
            int max = 0;
            if(a >= b && a >= c) max = a;
            else if(b >= a && b >= c) max = b;
            else max = c;
            result = max * 100;
        }

        System.out.println(result);
    }
}