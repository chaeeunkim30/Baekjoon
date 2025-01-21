import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[][] = new int[9][9];
        int max = num[0][0], row = 1, column = 1;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                num[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(num[i][j] >= max){
                    max = num[i][j];
                    row = i + 1;
                    column = j + 1;
                } else if(max == 0) {
                    row = 1;
                    column = 1;
                }
            }
        }

        System.out.println(max);
        System.out.print(row + " " + column);
    }
}