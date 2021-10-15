package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_67256 {
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int lx = 1, ly = 4;
        int rx = 3, ry = 4;
        for(int i = 0; i<numbers.length; i++){
           int num = numbers[i];
           if (num == 1 || num == 4 || num == 7){
               lx = 1;
               ly = num/3 + 1;
               answer += "L";
           }
           else if (num == 3 || num == 6 || num == 9){
               rx = 3;
               ry = num/3;
               answer += "R";
           }
           else {
               int numx = 2;
               int numy = 0;
               if (num == 2) numy = 1;
               else if (num == 5) numy = 2;
               else if (num == 8) numy = 3;
               else if (num == 0) numy = 4;

               int llength = Math.abs(numx - lx) + Math.abs(numy - ly);
               int rlength = Math.abs(numx - rx) + Math.abs(numy - ry);

               if(llength == rlength){
                   if(hand.equals("right")){
                       answer += "R";
                       rx = numx;
                       ry = numy;
                   }
                   else {
                       answer += "L";
                       lx = numx;
                       ly = numy;
                   }
               }
               else{
                   if (llength > rlength){
                       answer += "R";
                       rx = numx;
                       ry = numy;
                   }
                   else {
                       answer += "L";
                       lx = numx;
                       ly = numy;
                   }
               }
           }

        }
        return answer;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }
}
