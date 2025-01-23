import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int b = sc.nextInt();

        long result = 0;
        int exp = 0;
        int num = 0;

        for(int i = n.length() - 1; i >= 0; i--){
            char ch = n.charAt(i);
            if(ch >= '0' && ch <= '9') num = ch - '0';
            else num = ch - 55;
            result += num * Math.pow(b, exp++);
        }
        System.out.println(result);
    }
}