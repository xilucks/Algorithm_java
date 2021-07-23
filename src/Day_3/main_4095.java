package Day_3;

import java.io.BufferedReader;
import java.util.Scanner;

public class main_4095 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i =0; i<n; i++){
            for(int j = i; j <n; j++){
                int sum = 0;
                for (int k = i; k<=j ; k++){
                    sum += arr[k];
                }
                if (sum == target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
