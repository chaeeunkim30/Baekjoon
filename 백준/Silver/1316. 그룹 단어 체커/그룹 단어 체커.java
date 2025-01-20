import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++){
            if(check(sc.next())) cnt++;
        }
        System.out.println(cnt);
    }

    static boolean check(String str){
        boolean bool[] = new boolean[26];
        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i);
            int prev = (i > 0) ? str.charAt(i - 1) : 0;
            if(bool[now - 'a'] == false) bool[now - 'a'] = true;
            else if (now != prev) return false;
        }
        return true;
    }
}