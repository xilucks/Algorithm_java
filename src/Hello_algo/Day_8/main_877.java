package Hello_algo.Day_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main_877 {
    static ArrayList<ArrayList<Integer>> GraphList;
    static boolean visited[];
    static int visit = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int computer = Integer.parseInt(br.readLine());
        int link = Integer.parseInt(br.readLine());

        GraphList = new ArrayList<ArrayList<Integer>>();
        visited = new boolean[computer + 1];

        for(int i = 0; i <= computer; i++){
            GraphList.add(new ArrayList<Integer>());
        }

        for(int i = 0; i<link; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            GraphList.get(n).add(m);
            GraphList.get(m).add(n);
        }


        dfs(1);


        System.out.println(visit);

    }

    public static void dfs(int x){
        visited[x] = true;
        for(int i = 0; i< GraphList.get(x).size(); i++){
            int y = GraphList.get(x).get(i);
            if(! visited[y]) {
                visit++;
                dfs(y);

            }

        }
    }
}
