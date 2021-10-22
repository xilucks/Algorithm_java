import java.util.ArrayList;

public class Solution_76501 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i<absolutes.length;i++){
            if(signs[i]){
                answer += absolutes[i];
            }
            else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {4,7,12};
        boolean[] b = {true,false,true};
        System.out.println(solution(a,b));
    }
}