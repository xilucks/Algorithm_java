package programmers;

import java.util.Stack;

public class Solution_64061 {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<moves.length; i++){
            int tmp = 0;
            int index=  moves[i]-1;
            int deep = 0;
            while(true){
                if(board[deep][index] == 0){
                    if(deep == board.length-1){
                        tmp = 0;
                        break;
                    }
                    else{
                        deep++;
                    }

                }
                else {
                    tmp = board[deep][index];
                    board[deep][index] = 0;
                    break;
                }
            }
            if (tmp == 0){
                continue;
            }
            else if(stack.isEmpty()){
                stack.push(tmp);
            }
            else if(tmp != stack.peek()){
                stack.push(tmp);
            }
            else {
                stack.pop();
                answer +=2;
            }



        }

        return answer;
    }
    public static void main(String args[]){
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));

    }
}
