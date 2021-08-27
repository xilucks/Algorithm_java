package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_11723 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        StringBuilder sb=  new StringBuilder();
        String str = "";
        int x = 0;
        for(int i = 0 ; i <N; i++){
            st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            if(! str.equals("all") && ! str.equals("empty")){
                x = Integer.parseInt(st.nextToken());
            }

            if(str.equals("add")){
                hs.add(x);
            }
            else if(str.equals("remove")){
                hs.remove(x);
            }
            else if(str.equals("check")){
                boolean chk = hs.contains(x);
                if(chk) sb.append(1+"\n");
                else sb.append(0+"\n");

            }
            else if(str.equals("toggle")){
                boolean chk = hs.contains(x);
                if(! chk){
                    hs.add(x);
                }
                else{
                    hs.remove(x);
                }

            }
            else if(str.equals("all")){
                for(int j = 1 ; j<=20; j++){
                    hs.add(j);
                }

            }
            else if(str.equals("empty")){
                hs.clear();

            }

        }
        System.out.println(sb);
    }
}
