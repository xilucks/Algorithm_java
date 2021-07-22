package Hello_algo.Day_2;

import java.util.Scanner;

public class main_2123 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //cardnum
        int m = sc.nextInt(); //targetnum
        int [] arr = new int[n];
        for (int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i =0; i <n-2; i++){
            for (int j = i+1; j< n-1;j++){
                for (int k = j+1; k< n; k++){
                    int total = arr[i]+arr[j]+arr[k];
                    if (total > max && total<=m){
                        max = total;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
