package Silver;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
public class Main_12789 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();    //Stack 생성
        Queue<Integer> queue = new LinkedList<>();      //queue 생성
        int index = 1;  //번호표
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            queue.add(sc.nextInt());
        }
        while(index<=n) {
            //queue가 비어있지 않으면서 queue의 가장 앞쪽(peek)가 해당순번(index)이면 탈출
            if (queue.isEmpty()==false &&queue.peek() == index) {
                queue.poll();
                index++;

            }
            //stack에 사람이 있는데 stack의 가장 위 사람(옆의 사이드 줄에 위치)가 해당 순번이면 탈출
            else if (stack.empty()==false &&stack.peek() == index) {
                stack.pop();
                index++;

            }
            //옆줄이 비어있거나, 옆줄의 사람보다 현재 줄선 사람이 더 앞순서일 경우 탈출시켜줌
            else if(stack.empty()||queue.peek()<=stack.peek()){
                stack.push(queue.poll());

            }
            //만일  해당 순서의 사람이 n보다 작거나 같을 때 반복문 탈출
            //ex)3번째 사람이 빠져나가야 하는데 5번째 사람이 탈출할 수 밖에 없을 때
            else if (index <=n){
                break;
            }

        }
        //줄이 다 탈출하면 모두 간식을 받은 상황이므로 NICE
        if(queue.isEmpty() ==true){
            System.out.println("Nice");
        }
        else{
            System.out.println("Sad");
        }

    }
}
