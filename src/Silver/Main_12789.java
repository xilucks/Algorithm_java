package Silver;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
public class Main_12789 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<>();
        int index = 1;
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            queue.add(sc.nextInt());
        }
        while(index<=n) {

            if (queue.isEmpty()==false &&queue.peek() == index) {
                queue.poll();
                index++;

            }
            else if (stack.empty()==false &&stack.peek() == index) {
                stack.pop();
                index++;

            }
            else if(stack.empty()||queue.peek()<=stack.peek()){
                stack.push(queue.poll());

            }
            else if (index <=n){
                break;
            }

        }
        if(queue.isEmpty() ==true){
            System.out.println("Nice");
        }
        else{
            System.out.println("Sad");
        }

    }
}
