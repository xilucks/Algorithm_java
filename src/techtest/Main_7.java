package techtest;

public class Main_7 {
    public static String[] solution(String[] grid, boolean clockwise) {
        String[] answer = {};
        int lenx = 0;
        int leny = grid.length;
        for(int i = 0; i<grid.length; i++){
            if(grid[i].length() > lenx ){
                lenx = grid[i].length();
            }
        }

        int[][] arr = new int[lenx][lenx];
        int[][] ans = new int[lenx][lenx];
        int[][] ans2 = new int[lenx][lenx];
        for(int i = 0 ; i<grid.length; i++){
            String str = grid[i];
            for(int j = 0; j < grid[i].length(); j++){
                arr[i][j] = grid[i].charAt(j) - '0';
            }
        }
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                if(clockwise){
                    ans[i][j] = arr[n-j-1][i];
                }else{
                    ans[i][j] = arr[j][n-i-1];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                if(clockwise){
                    ans2[i][j] = ans[n-j-1][i];
                }else{
                    ans2[i][j] = ans[j][n-i-1];
                }
            }
        }

        for(int i = 0; i<lenx;i++){
            while(ans2[lenx-1][i] == 0){
                for(int j = lenx-1; j > 0; j--){
                    ans2[j][i] = ans2[j-1][i];
                }
            }
        }
        for(int i = 0; i<lenx;i++){
            boolean pass = true;
            for(int j =0; j <ans2[i].length;j++){
                if(ans2[i][j] != 0){
                    pass = false;
                }
            }
            if(pass){
                continue;
            }
          else{
              for(int a =0; a<lenx; a++){
                    while(ans2[a][0] == 0){
                        for(int b = 4; b > 0; b--){
                            ans2[a][b-1] = ans2[a][b];
                        }
                    }
                }
            }
        }


        System.out.println();
        for(int i = 0 ; i<lenx; i++){
            for(int j = 0; j < lenx; j++){
                System.out.print(ans2[i][j]);
            }
            System.out.println();
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] grid = {"1","234","56789"};
        boolean clockwise = true;
        System.out.println(solution(grid,clockwise));
    }
}
