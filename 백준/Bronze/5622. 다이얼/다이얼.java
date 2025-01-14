import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int sum = 0;

        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) == 'A') sum += 3;
            if(st.charAt(i) == 'B') sum += 3;
            if(st.charAt(i) == 'C') sum += 3;
            if(st.charAt(i) == 'D') sum += 4;
            if(st.charAt(i) == 'E') sum += 4;
            if(st.charAt(i) == 'F') sum += 4;
            if(st.charAt(i) == 'G') sum += 5;
            if(st.charAt(i) == 'H') sum += 5;
            if(st.charAt(i) == 'I') sum += 5;
            if(st.charAt(i) == 'J') sum += 6;
            if(st.charAt(i) == 'K') sum += 6;
            if(st.charAt(i) == 'L') sum += 6;
            if(st.charAt(i) == 'M') sum += 7;
            if(st.charAt(i) == 'N') sum += 7;
            if(st.charAt(i) == 'O') sum += 7;
            if(st.charAt(i) == 'P') sum += 8;
            if(st.charAt(i) == 'Q') sum += 8;
            if(st.charAt(i) == 'R') sum += 8;
            if(st.charAt(i) == 'S') sum += 8;
            if(st.charAt(i) == 'T') sum += 9;
            if(st.charAt(i) == 'U') sum += 9;
            if(st.charAt(i) == 'V') sum += 9;
            if(st.charAt(i) == 'W') sum += 10;
            if(st.charAt(i) == 'X') sum += 10;
            if(st.charAt(i) == 'Y') sum += 10;
            if(st.charAt(i) == 'Z') sum += 10;
        }

        System.out.print(sum);
    }
}