package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N+1][M+1];
        for (int i = 1; i<= N; i++){
            String str = br.readLine();
            for(int j = 1 ; j<=M ; j++){
                arr[i][j] = str.charAt(j-1);
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int y = 1; y<= N-7 ; y++){             // 1
            for(int x = 1 ; x<=M-7; x++){           // 6
                for(int k = 1 ; k<=2; k++){
                    boolean state = false;
                    boolean ystate = false;
                    int tmp  = 0 ;
                    if(k == 1){
                        ystate = true;
                        state = true;
                        tmp ++;
                    }
                    else{
                        ystate = false;
                    }//1 -8
                    for(int i = y; i<= y+7; i++) {   // 6 -13
                        for (int j = x ; j<=x+7; j++) {
                            if(i == y && j == x){
                                continue;
                            }
                            if (i != y && j == x) {
                                if (arr[i - 1][j] == arr[i][j] && !ystate) {
                                    tmp++;
                                    state = true;
                                    ystate = true;
                                }
                                else if (arr[i - 1][j] != arr[i][j] && ystate){
                                    tmp++;
                                    state = true;
                                    ystate = true;

                                }
                                else {
                                state = false;
                                ystate = false;
                            }
                        }
                            else {
                                if (state == true) { //흰흰흰
                                if (arr[i][j] == arr[i][j - 1]) {
                                    state = false;

                                } else {   //흰흰검
                                    tmp++;
                                    state = true;

                                }
                            } else {
                                if (arr[i][j] == arr[i][j - 1]) { //흰검검 or 흰흰
                                    tmp++;
                                    state = true;
                                } else {//흰검흰
                                    state = false;
                                }

                            }
                        }
                    }
                    }
                    ans = Integer.min(ans, tmp);

                }
            }
        }
        System.out.println(ans);
    }

}
