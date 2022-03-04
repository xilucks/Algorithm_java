package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_13549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[100001];

        Deque<Integer> queue = new LinkedList<>();
        queue.add(N);

        arr[N]=1;
        while(!queue.isEmpty()){
            int index = queue.poll();

            if(index*2 < arr.length && ((arr[index*2] == 0) || (arr[index] < arr[index*2]))){
                queue.addFirst(2 * index);
                arr[index*2] = arr[index];
            }
            if(index-1 >= 0 && ((arr[index-1] == 0) || (arr[index]+1 < arr[index-1]))){
                queue.add(index-1);
                arr[index-1] = arr[index]+1;
            }
            if(index+1 < arr.length && ((arr[index+1] == 0) || (arr[index]+1 <arr[index+1]))){
                queue.add(index+1);
                arr[index+1] = arr[index]+1;
            }


        }

        System.out.println(arr[K]-1);

    }
}
