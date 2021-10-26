package programmers.level2;

public class Solution_12913 {
    static int solution(int[][] land) {
        int answer = 0;
        int[] dp = new int[4];
        for(int i = 0; i<land.length; i++){
            if(i == 0){
                for(int j = 0 ;j<4;j++) dp[j] = land[i][j];
            }
            else{
                int one = dp[0], two= dp[1], three = dp[2], four = dp[3];
                dp[0] = land[i][0] + Math.max(Math.max(two,three),four);
                dp[1] = land[i][1] + Math.max(Math.max(one,three),four);
                dp[2] = land[i][2] + Math.max(Math.max(one,two),four);
                dp[3] = land[i][3] + Math.max(Math.max(one,two),three);
            }
        }
        answer = Math.max(Math.max(dp[0],dp[1]),Math.max(dp[2],dp[3]));

        return answer;
    }

    public static void main(String[] args) {
        int[][]land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution(land));


    }
}
