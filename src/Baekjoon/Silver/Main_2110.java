package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int l = 1;
        int r = list.get(N-1)-list.get(0);

        while(l<r){
            int mid = (l+r+1)/2;
            int index = list.get(0);
            int wifi = 1;
            for(int i = 0 ; i<N; i++){
                if(list.get(i) >= index + mid){
                    index = list.get(i);
                    wifi ++;
                    if(wifi >= C) break;
                }
            }
            if(wifi >= C) l = mid;
            else r = mid-1;

        }
        System.out.println(l);
    }
}
