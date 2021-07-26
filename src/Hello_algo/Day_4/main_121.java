package Hello_algo.Day_4;

import java.io.*;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main_121 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int count = sc.nextInt();
        int back = -1;
        for(int i = 0; i<count; i++){
            String str = sc.next();
            if(str.equals("push")){
                int n = sc.nextInt();
                queue.offer(n);
                back = n;
            }
            else if (str.equals("pop")){
                if(queue.isEmpty()) bw.write(-1+"\n");
                else bw.write(queue.poll()+"\n");
            }
            else if (str.equals("size")){
                bw.write(queue.size()+"\n");
            }
            else if (str.equals("empty")){
                if(queue.isEmpty()) bw.write(1+"\n");
                else bw.write(0+"\n");
            }
            else if (str.equals("front")){
                if(queue.isEmpty()) {
                    bw.write(-1 + "\n");
                }
                else bw.write(queue.peek()+"\n");
            }
            else if (str.equals("back")){
                if(queue.isEmpty()){
                    bw.write(-1+"\n");
                    back = 0;
                }
                else bw.write(back+"\n");
            }

        }
        bw.flush();
        bw.close();
        br.close();

    }
}
