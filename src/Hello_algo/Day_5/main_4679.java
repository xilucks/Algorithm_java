package Hello_algo.Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class main_4679 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        TreeSet<String> ts = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String move = st.nextToken();

            if (move.equals("enter")){
                if(!ts.contains(name)){
                    ts.add(name);
                }
            }
            else if(move.equals("leave")){
                if(ts.contains(name)){
                    ts.remove(name);
                }
            }

        }
        sb.append(ts.size()+"\n");
        for(String i : ts){
            sb.append(i + "\n");
        }

        System.out.println(sb);
    }
}
