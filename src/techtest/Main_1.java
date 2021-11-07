package techtest;

public class Main_1 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[3];
        int[] countarr = new int[3];
        for(int i = 0; i<arr.length; i++){
           countarr[arr[i]-1] += 1;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<countarr.length;i++){
            if (max < countarr[i]) max = countarr[i];
        }
        for(int i = 0; i<countarr.length;i++){
            int tmpnum = 0;
            while(countarr[i]<max){
                countarr[i]++;
                tmpnum++;
            }
            answer[i] = tmpnum;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 3, 1};
        int[] ansarr = solution(arr);
        for(int i = 0; i<ansarr.length;i++){
            System.out.println(ansarr[i]);
        }

    }
}
