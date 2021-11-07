package techtest;

import java.util.HashMap;

public class Main_3 {
    public static int solution(String[] ings, String[] menu, String[] sell) {
        HashMap<Character,Integer> ingsprice = new HashMap<>();
        int answer = 0;
        for(int i = 0; i< ings.length; i++){
            String[] tmp = ings[i].split(" ");
            char recipename = ings[i].charAt(0);
            ingsprice.put(recipename,Integer.parseInt(tmp[1]));
        }
        HashMap<String,Integer> menuprice = new HashMap<>();
        for(int i = 0; i<menu.length; i++){
            String[] menus = menu[i].split(" ");
            String recipe = menus[1];
            int makeprice = 0;
            for(int j = 0 ; j<recipe.length(); j++){
                char ing = recipe.charAt(j);
                makeprice += ingsprice.get(ing);
            }
            menuprice.put(menus[0],Integer.parseInt(menus[2])-makeprice);
        }
        for(int i =0; i<sell.length;i++){
            String[] tmp = sell[i].split(" ");
            int sellnum = Integer.parseInt(tmp[1]);
            String name = tmp[0];
            answer += sellnum * menuprice.get(name);
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] ings = {"r 10", "a 23", "t 124", "k 9"};
        String[] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
        String[] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};
        System.out.println(solution(ings,menu,sell));

    }
}
