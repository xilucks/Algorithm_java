package Hello_algo.Day_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main_4696 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   //총 층 개수
        int A = Integer.parseInt(st.nextToken());   //시작 층
        int B = Integer.parseInt(st.nextToken());   //목표 층
        int U = Integer.parseInt(st.nextToken());   //U만큼 올라가는 버튼
        int D = Integer.parseInt(st.nextToken());   //D만큼 내려가는 버튼

        int[] dist = new int[N+1];

        Queue<Integer> queue = new LinkedList<>();
        dist[A] = 1;

        queue.offer(A);

        while(!queue.isEmpty()){
            int x = queue.poll();
            if(x+U <= N && dist[x+U] == 0){
                dist[x+U] = dist[x]+1;
                queue.offer(x+U);
            }
            if(x-D > 0 && dist[x - D] == 0){
                dist[x-D] = dist[x]+1;
                queue.offer(x-D);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(dist[B] == 0) sb.append("use the stairs");
        else sb.append(dist[B]-1);

        System.out.println(sb);

    }
}
