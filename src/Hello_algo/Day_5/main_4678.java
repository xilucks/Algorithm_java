package Hello_algo.Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class main_4678 {
    public static void main(String args[]) throws IOException {
        HashSet<String> hs = new HashSet<>();
        TreeSet<String> ts = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int listen = Integer.parseInt(st.nextToken());
        int watch = Integer.parseInt(st.nextToken());
        for(int i = 0 ; i<listen; i++){
            String name= br.readLine();
            hs.add(name);
        }
        int count = 0;
        for(int i = 0; i<watch; i++){
            String name = br.readLine();
            if(hs.contains(name)) {
                ts.add(name);
                count++ ;
            }
        }
        Object[] list = ts.toArray();
        for (int i = 0; i<ts.size(); i++){
            sb.append(list[i]+"\n");
        }
        System.out.println(count);
        System.out.println(sb);
    }

}
