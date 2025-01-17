import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[26];
        String str = br.readLine();
        int max = -1;
        char ch = '?';

        for(int i = 0; i < str.length(); i++){
            if('a' <= str.charAt(i) && str.charAt(i) <= 'z') arr[str.charAt(i) - 97]++;
            else arr[str.charAt(i) - 65]++;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char) (i + 65); // 대문자 출력을 위함
            } else if(arr[i] == max) ch = '?';
        }
        System.out.print(ch);
    }
}