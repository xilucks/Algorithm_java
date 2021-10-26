package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_12939 {
    public static String solution(String s) {
        String answer = "";
        String[] strs = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<strs.length;i++){
            arr.add(Integer.parseInt(strs[i]));
        }
        Collections.sort(arr);
        answer += arr.get(0);
        answer += " ";
        answer += arr.get(arr.size()-1);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));

    }
}
