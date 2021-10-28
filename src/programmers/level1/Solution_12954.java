package programmers.level1;

public class Solution_12954 {
    public long[] solution(long x, long n) {
        long[] answer = new long[(int) n];
        long num = x;
        for(long i = 0; i<n; i++){
            answer[(int) i] = num;
            num += x;
        }
        return answer;
    }
    public static void main(String[] args) {


    }
}
