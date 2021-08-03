package Day_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main_296 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int [][] arr = new int[width][height];
        for(int i =0; i < height; i++){
            String str = br.readLine();
            for(int j = 0; j<width; j++ ){
                arr[j][i] = (int)str.charAt(j) - 48;
            }
        }
        int max = 0;
        int sqheight = 0;
        int sqwidth =0;
        for(int y = 0; y<height; y++){

            for(int x = 0; x<width; x++){

                int dotnum = 0; //점 개수 점이 4개가 되면 사각형
                int firstdot = arr[x][y]; // 첫 점의 숫자 index;
                dotnum ++;
                int x2 = 0, y2 =0;
                for(int X = x; X<width; X++){
                    if(arr[X][y] == firstdot){  //second dot
                        sqwidth = X-x+1;
                        dotnum++;
                        x2 = X;
                        y2 = y;
                        for(int Y2 = y; Y2 < height; Y2++){
                            if(arr[x][Y2] == firstdot && X == x2){   //3rd dot
                                dotnum++;
                                sqheight = Y2-y+1;

                                for(int X2 = x ; X2<width; X2++){
                                    if(arr[X2][Y2] == firstdot && sqheight == sqwidth) {  //4th dot
                                        dotnum++;

                                    }

                                }
                            }

                            if(max < sqheight*sqwidth && dotnum ==4 && sqheight == sqwidth){
                                max = sqheight*sqwidth;
                            }
                            else{
                                dotnum --;
                            }

                        }

                    }
                }
            }
        }
        System.out.println(max);
    }
}
