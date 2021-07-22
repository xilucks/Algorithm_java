package Hello_algo.Day_2;

import java.util.Scanner;

public class main_406 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        for(int k = 0; k< num; k++){
            System.out.print(arr[k]+ " ");
        }
        for (int i =num; i>0; i--){
            for(int j = 0; j<i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    System.out.println();
                    for(int k = 0; k< num; k++){
                        System.out.print(arr[k]+ " ");
                    }
                }

            }


        }
    }
}
