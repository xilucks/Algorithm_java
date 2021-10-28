package programmers.level2;

import java.util.ArrayList;

public class Solution_42586 {
    public static int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        int index = 0;
        while(index != progresses.length){
            if(progresses[index] <100){
                while(progresses[index] < 100){
                    for(int i = index; i<progresses.length;i++){
                        progresses[i] += speeds[i];
                    }
                }
            }
            int tmp =index;
            for(int i = tmp; i<progresses.length;i++){
                if(progresses[i] >= 100){
                    count++;
                    index++;
                }
                else{
                    break;
                }
            }
            answer.add(count);
            count = 0;
        }
        int[] ans = new int[answer.size()];
        for(int i =0; i<answer.size(); i++){
            ans[i] = answer.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] progress = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        System.out.println(solution(progress,speeds));
    }
}
