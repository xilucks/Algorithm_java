package Farm_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] nums = str.split(" ");
        int[] arr = new int[nums.length];

        for(int i = 0 ; i<nums.length;i++){
            arr[i] = Integer.parseInt(nums[i]);
        }
        int max = arr[1];
        for(int i = 0; i < nums.length-1; i++) {
            if(arr[i] > max){
                max = arr[i];
            }


        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<nums.length; i++){
            if(arr[i] != max){
                sb.append(arr[i]+" ");
            }
        }
        System.out.println(sb);


    }
}
