package Silver;

import java.io.*;
import java.util.*;

public class Main_1764 {
    public static void main(String args[]) throws IOException {
        ArrayList<String > list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nol = Integer.parseInt(st.nextToken());
        int nos = Integer.parseInt(st.nextToken());
        ArrayList<String> names = new ArrayList<String>();
        for(int i =0; i<nol; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(st.nextToken());
        }
        for(int j =0; j<nos; j++){
            st = new StringTokenizer(br.readLine());
           String name = st.nextToken();
           if(list.contains(name)){
               names.add(name);
           }
        }
        Collections.sort(names);
        bw.write((int)names.size() + "\n");
        for(int i =0; i<names.size();i++){
            bw.write(names.get(i)+"\n");
        }
        bw.flush();
    }
}
