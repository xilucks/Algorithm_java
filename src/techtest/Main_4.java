package techtest;

import java.util.ArrayList;
import java.util.Collections;

public class Main_4 {
    public static int[] solution(String s) {
        int[] tmp = new int[s.length()];
        char main = ' ';
        int count = 1;
        int index = 0;
        for(int i = 0; i<s.length();i++){
            if(i == 0 ){
                main = s.charAt(i);
            }
            else {
                char now = s.charAt(i);
                if(now == main){
                    count++;
                }
                else{
                    tmp[index++] = count;
                    count = 1;
                    main = now;
                }
            }
            if(i == s.length()-1){
                tmp[index++] = count;
            }
        }

        if(s.charAt(0) == s.charAt(s.length()-1)){
            int tmpnum = tmp[0] + tmp[index-1];
            tmp[index-1] = tmpnum;
            tmp[0] = 0;
        }

        if(index == 1){
            tmp[0] = count;
        }


        //정답작성 존
        ArrayList<Integer> tmp2 = new ArrayList<>();
        for(int i = 0; i < tmp.length;i++){
            if(tmp[i] != 0){
                tmp2.add(tmp[i]);
            }
        }
        Collections.sort(tmp2);
        int[] answer = new int[tmp2.size()];
        for(int i = 0; i<tmp2.size(); i++){
            answer[i] = tmp2.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "www";
        int[] arr =(solution(s));
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
