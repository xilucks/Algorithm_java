package Silver;
//wrong
import java.util.ArrayList;

public class Main_1158 {
    static void Josephus(int n,int k){
        int[] arr = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = i+1;
        }
        int count =0;
        int index = k-2;
        int tmp =0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(true) {
            index = (index+1)%n;
            if(result.isEmpty() == true) {
                result.add(arr[index]);
            }
            else if(! result.contains(arr[index])){
                if(count == k){
                    result.add((count+index)%n);
                    index = (index+count)%n;
                    count = 0;
                }
                index--;
                count++;
            }
            System.out.println(index);
            System.out.println(result);
            System.out.println(result.size());
            if(result.size() == n) break;
        }
        System.out.println(result);

    }
    public static void main(String args[]){
        Josephus(7,3);
    }
}
