import java.util.ArrayList;

public class Solution_72410 {
    public static String solution(String new_id) {
        String answer = "";
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i<new_id.length();i++){
            char ch = new_id.charAt(i);
            if((int)ch>= 97 && (int)ch<= 122){
                list.add(ch);
            }
            else if((int)ch >= 65 && (int)ch <=90){
                ch += 32;
                list.add(ch);
            }
            else if(ch - '0' >= 0 && ch-'0'<= 9){
                list.add(ch);
            }
            else if(ch == '_' || ch == '-' || ch == '.'){
                if(ch == '.' && list.isEmpty()){
                    continue;
                }
                else if(ch == '.' && list.get(list.size()-1) == '.'){
                    continue;
                }
                else {
                    list.add(ch);
                }
            }

        }
        if(list.isEmpty()){
            list.add('a');
        }
        if(list.size() >= 16){
            for (int i = list.size()-1; i>14; i--){
                list.remove(i);
            }
        }
        int index = list.size()-1;
        while(list.get(index) == '.'){
            list.remove(index);
            index --;
        }
        if(list.size() <= 2){
            while(list.size() != 3){
                char tmp = list.get(list.size()-1);
                list.add(tmp);
            }
        }

        for (int i = 0; i<list.size(); i++){
            answer += list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("abcdefghijklmn.p"));
    }
}