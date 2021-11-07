package techtest;

import java.util.LinkedList;
import java.util.Queue;

public class Main_5 {
    public static int[][] solution(int rows, int columns) {
        Queue<Integer[]> queue = new LinkedList<>();
        int[][] answer = new int[rows][columns];
        int[][] arr = new int[rows+1][columns+1];
        arr[1][1] = 1;
        queue.offer(new Integer[]{1,1});
        while(! queue.isEmpty()){
            Integer[] tmp = queue.poll();
            int r = tmp[0];
            int c = tmp[1];

            int nr = 0;
            int nc = 0;


            if(arr[r][c]%2 == 0){
                if(r == rows){
                    nr = 1;
                    nc = c;
                }
                else{
                    nr = r+1;
                    nc = c;
                }
            }
            else{
                if(c == columns){
                    nr = r;
                    nc = 1;
                }
                else{
                    nr = r;
                    nc = c+1;
                }
            }
            int tmpnum = 0;
            if(nr < 1 || nr > rows || nc <1 || nc>columns){
                continue;
            }

            else{
                tmpnum  = arr[nr][nc];
                arr[nr][nc] = arr[r][c]+1;
            }

            if(tmpnum != 0 &&arr[nr][nc]!= 0 && (tmpnum%2 == arr[nr][nc]%2)){
                arr[nr][nc] = tmpnum;
                break;
            }

            queue.offer(new Integer[] {nr,nc});
            boolean exit = true;
            for(int i = 1 ; i <= rows; i++){
                for (int j = 1; j<=columns; j++){
                    if(arr[i][j] == 0){
                        exit = false;
                    }
                }
            }
            if(exit) break;
        }

        for(int i = 1 ; i <= rows; i++){
            for (int j = 1; j<=columns; j++){
                answer[i-1][j-1] = arr[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int rows = 3;
        int colums =3;
        int[][] arr = solution(rows,colums);
        for(int i = 0 ; i < rows; i++){
            for (int j = 0; j<colums; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
