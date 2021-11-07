package techtest;

public class Main_6 {
    public static String solution(double time, String[][] plans) {
        String answer = "";

        int monopen = 13*60;
        int monend = 18*60;
        int friend = 18*60;
        int friopen = 9*60+30;

        int vacation = (int)time *60;
        if(time/1 != 0){
            vacation += 30;
        }

        for(int i = 0; i<plans.length; i++){
            boolean startpm = false;
            boolean endpm = false;
            if(plans[i][1].charAt(plans[i][1].length()-2) == 'P'){
                startpm = true;
            }
            if(plans[i][2].charAt(plans[i][2].length()-2) == 'P'){
                endpm = true;
            }
            String country = plans[i][0];
            String start = plans[i][1].replace("P","").replace("A","").replace("M","");
            String end = plans[i][2].replace("P","").replace("A","").replace("M","");;
            int startplans = 0;
            int endplans = 0;
            if(startpm) {
                startplans = Integer.parseInt(start) * 60;
                startplans += 12 * 60 ;
            }
            else{
                startplans = Integer.parseInt(start) * 60;
            }

            if(endpm) {
                endplans = Integer.parseInt(end) * 60;
                endplans += 12*60;
            }
            else {
                endplans = Integer.parseInt(end) * 60;
            }

            int lostmon = endplans - monopen;
            int lostfri = friend - startplans;
//            System.out.println(vacation +" " +country + " " + lostmon + " " +lostfri);
            if(lostmon < 0) lostmon = 0;
            if(lostfri < 0) lostfri = 0;

            int tmpnum = vacation - Math.abs(lostmon) - Math.abs(lostfri);
//            System.out.println(tmpnum);
            if(tmpnum > 0){
                answer = country;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        double time = 3.5;
        String[][] plans = {{"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"} };
        System.out.println(solution(time,plans));
    }
}
