package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        int Target = Integer.parseInt(br.readLine());

        int l = 0;
        int r = arr.size()-1;
        int ans =0;
        while(l<r){
            if(arr.get(l) + arr.get(r) < Target){
                l++;
            }
            else if(arr.get(l) + arr.get(r) == Target){
                ans++;
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println(ans);
    }
}
