package Hello_algo.Day_1;


import java.io.IOException;
import java.util.Scanner;

public class main_1144 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int min = 101;
        int max = 0;
        for (int i =0; i<2;i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m < min) min = m;
            if (n > max) max = n;
            for(int j = m; j<n; j++){
                arr[j] += 1;
            }
        }
        int answer = 0;
        for (int i = min; i <max; i++){
            if (arr[i] >0) answer++;
        }

        System.out.println(answer);


    }
}
