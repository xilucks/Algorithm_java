package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1436 {
    public static void main(String[] args) throws IOException {
        String target = "666";
        int count = 1;
        int num = 666;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N != count){
            num ++;
            if(String.valueOf(num).contains("666")){
                count++;
            }

        }
        System.out.println(num);
    }
}
