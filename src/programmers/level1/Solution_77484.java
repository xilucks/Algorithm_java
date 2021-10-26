package programmers.level1;

public class Solution_77484 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero =0;
        int count = 0;
        for(int i = 0; i<lottos.length;i++){
            if(lottos[i] == 0) {
                zero ++;
                continue;
            }
            for(int j = 0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count ++;
                    break;
                }
            }
        }
        int max = count + zero;
        int min = count;
        answer[0] = cal(max);
        answer[1] = cal(min);
        return answer;
    }

    static int cal(int x){
        switch (x){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;

        }
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] arr =(solution(lottos,win_nums));
        System.out.println(arr[0]+" "+arr[1]);
    }
}
