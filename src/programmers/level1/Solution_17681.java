public class Solution_17681 {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[]ans = solution(5, arr1, arr2);
        for(int i = 0; i< ans.length; i++){
            System.out.println(ans[i]);
        }

    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i<n; i++){
            int tmp1 = arr1[i];
            int tmp2 = arr2[i];
            String str1 = Integer.toBinaryString(tmp1);
            String str2 = Integer.toBinaryString(tmp2);
            while(str1.length() < n){
                str1 = '0'+str1;
            }
            while(str2.length() < n){
                str2 = '0'+str2;
            }
            String tmp = "";
            for(int j =0; j<n; j++){
                if(str1.charAt(j) == '1' || str2.charAt(j)=='1'){
                    tmp += 1;
                }
                else{
                    tmp += 0;
                }
            }
            String tmpans ="";
            for(int j =0; j<tmp.length(); j++){
                char index = tmp.charAt(j);
                if(index == '1'){
                    tmpans += '#';
                }
                else{
                    tmpans += ' ';
                }
            }
            answer[i] = tmpans;
        }
        return answer;
    }
}
