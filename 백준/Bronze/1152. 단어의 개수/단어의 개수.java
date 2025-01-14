import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer: 문자열을 여러 개의 토큰으로 분리
        StringTokenizer st = new StringTokenizer(bf.readLine());

        System.out.println(st.countTokens());
    }
}