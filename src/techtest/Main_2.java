package techtest;

public class Main_2 {
    public static String solution(String[] log) {
        String answer = "";
        int totaltime = 0;
        int ontime = 0;
        int offtime = 0;
        boolean onoff = false;
        for(int i =0; i<log.length;i++){
            //시작 종료시간
            if(onoff == false) {
                onoff = true;
            }
            else if(onoff == true) {
                onoff = false;
            }

            String tmp = log[i];
            String[] times = tmp.split(":");
            if(onoff == true){
                ontime = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
               // System.out.println(ontime);
            }
            else if(onoff == false){
                offtime = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
                //System.out.println("offtime "+offtime);
                int time = offtime - ontime;
                //System.out.println("time "+time);
                if (time > 105){
                    time = 105;
                }
                else if (time < 5){
                    time = 0;
                }
                totaltime += time;
            }

        }
        int h = totaltime/60;
        int m = totaltime%60;
        //System.out.println(totaltime);
        String strh = "";
        String strm = "";
        if(h < 10){
            answer += "0"+h+":";
        }
        else{
            answer += h +":";
        }

        if(m<10){
            answer += "0"+m;
        }
        else{
            answer += m +"";
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"00:00", "00:00", "00:00", "00:05", "00:00", "00:00"};
        System.out.println(solution(arr));
    }
}
