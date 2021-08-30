package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_1920 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> nums = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            nums.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(nums);
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            int l =0;
            int r = nums.size()-1;
            int ans = 0;
            while(l<r){
                int mid = (l+r+1)/2;
                int tmp = nums.get(mid);

                if (tmp <= num){
                    l = mid;
                }
                else{
                    r = mid-1;
                }

                if(nums.get(l) == num){
                    ans = 1;
                    break;
                }

            }
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }

}
