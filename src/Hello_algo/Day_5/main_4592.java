package Hello_algo.Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class main_4592 {
    public static void main(String args[]) throws IOException {
        HashMap<String, Integer> hm = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i =0; i<n; i++){
            String name = br.readLine();
            if(hm.containsKey(name)){
                hm.replace(name, hm.get(name)+1);
            }
            else{
                hm.put(name, 1);
            }
        }
        for(int i =0; i<n-1;i++){
            String name = br.readLine();
            if(hm.containsKey(name)){
                hm.replace(name, hm.get(name)-1);
            }
        }
        for(String i : hm.keySet()){
            if(0<hm.get(i)){
                System.out.println(i);
            }

        }
    }
}
