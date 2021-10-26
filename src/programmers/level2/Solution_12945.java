package programmers.level2;

public class Solution_12945 {
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i = 0; i<=n; i++){
            if(i == 0)arr[i] = 0;
            else if(i==1)arr[i] =1;
            else arr[i] = (arr[i-2] + arr[i-1])%1234567;
        }
        answer = arr[n];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
