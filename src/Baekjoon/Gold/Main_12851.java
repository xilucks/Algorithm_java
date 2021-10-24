package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_12851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[100001];
        int[] count = new int[100001];
        arr[N] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            int one = tmp -1;
            int two = tmp +1;
            int three = tmp*2;

            if(one >= 0){
                if(arr[one] == 0){
                    arr[one] = arr[tmp]+1;
                    queue.offer(one);
                }
                else{
                    if(arr[one] == arr[tmp]+1){
                        count[one] ++;
                        queue.offer(one);
                    }
                }
            }
            if(two < 100001){
                if(arr[two] == 0){
                    arr[two] = arr[tmp]+1;
                    queue.offer(two);
                }
                else{
                    if(arr[two]== arr[tmp]+1){
                        count[two] ++;
                        queue.offer(two);
                    }
                }
            }
            if(three < 100001){
                if(arr[three] == 0){
                    arr[three] = arr[tmp]+1;
                    queue.offer(three);
                }
                else{
                    if(arr[three] == arr[tmp]+1){
                        count[three]++;
                        queue.offer(three);
                    }
                }
            }

        }
        System.out.println(arr[K]-1);
        System.out.println(count[K]+1);
    }
}