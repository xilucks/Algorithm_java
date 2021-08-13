package Hello_algo.Final_Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_701 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int[][] arr =new int[H][W];

        for(int i = 0; i  < H; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j < W; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int Y = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[][] water = new int[H][W];
        for(int i = 0; i  < H; i++){
            for(int j =0; j<W; j++){
                int x = arr[i][j];
                if (x > 0){
                    water[i][j] = 1;
                    for(int a = 1; a <= x; a++){
                        if(i-a >= 0){
                            water[i-a][j] = 1;
                        }
                        if(i+a <H) {
                            water[i + a][j] = 1;

                        }
                        if(j-a >= 0){
                            water[i][j - a] = 1;


                        }
                        if(j+a < W){
                            water[i][j + a] = 1;

                        }
                    }
                }
            }
        }

        int ans =Integer.MAX_VALUE;

        for(int i = 0; i< H; i++){
            for(int j = 0; j <W ; j++){
                if (water[i][j] == 0){
                    int tmp = Math.abs(i-Y)+Math.abs(j-X);

                    ans = Math.min(ans, tmp);
                }
            }
        }

        if(ans == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }
}
