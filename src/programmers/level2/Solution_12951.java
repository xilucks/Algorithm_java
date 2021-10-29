package programmers.level2;

import java.util.Locale;

public class Solution_12951 {
    public static String solution(String s) {
        String answer = "";
        int index = 0;
        for(int i = 0; i<s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp == ' '){
                index = 0;
            }
            else{
                index ++;
            }

            if(index == 1){
                if(tmp >= 97 && tmp<=122){
                    tmp -= 32;
                }
            }
            else {
                if(tmp != ' ' && !(tmp >= 97 && tmp<=122)){
                    tmp += 32;
                }

            }

            answer += tmp;
        }
        return answer;
    }
        public static void main(String[] args) {
            System.out.println(solution("for the last week"));
        }

}
