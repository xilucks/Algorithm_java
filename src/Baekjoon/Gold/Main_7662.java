package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T --> 0){
            int N = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> minQueue = new PriorityQueue<>();
            HashMap<Integer, Integer> hm = new HashMap<>();

            while(N --> 0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String command = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if(command.equals("I")){
                    maxQueue.add(num);
                    minQueue.add(num);

                    if(!hm.containsKey(num)){
                        hm.put(num, 1);
                    }
                    else{
                        hm.put(num, hm.get(num) + 1);
                    }

                }
                else {
                    if(num == -1){
                        while(!minQueue.isEmpty() && hm.get(minQueue.peek()) <= 0){
                            minQueue.poll();
                            System.out.println('m');
                        }

                        if (minQueue.isEmpty()){
                            continue;
                        }
                        else{
                            int tmp = minQueue.poll();
                            hm.put(tmp, hm.get(tmp)-1);
                        }

                    }
                    else{
                        while(!maxQueue.isEmpty() && hm.get(maxQueue.peek()) <= 0){
                            maxQueue.poll();
                        }

                        if (maxQueue.isEmpty()){
                            continue;
                        }
                        else{
                            int tmp = maxQueue.poll();
                            hm.put(tmp, hm.get(tmp)-1);
                        }

                    }

                }

                while(!maxQueue.isEmpty() && hm.get(maxQueue.peek()) <= 0){
                    maxQueue.poll();
                }
                while(!minQueue.isEmpty() && hm.get(minQueue.peek()) <= 0){
                    minQueue.poll();
                }

            }

            if(minQueue.isEmpty() && maxQueue.isEmpty()){
                System.out.println("EMPTY");
            }
            else{
                System.out.println(maxQueue.peek() + " " + minQueue.peek());

            }

        }
    }
}
