import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuffer rev = new StringBuffer(str);
        String st = rev.reverse().toString();

        System.out.print(str.equals(st) ? "1" : "0");
    }
}