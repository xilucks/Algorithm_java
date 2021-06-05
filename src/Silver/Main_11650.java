package Silver;

import java.io.*;
import java.util.StringTokenizer;

public class Main_11650 {
    static void mergeSort(int[] x,int[] y){
        int tmpx[] = new int[x.length];
        int tmpy[] = new int[y.length];
        mergeSort(x,y,tmpx,tmpy,0,x.length-1);
    }
    static void mergeSort(int[] x, int[]y, int[]tmpx,int[]tmpy,int front,int end){
        if(front<end) {
            int mid = (front + end) / 2;
            mergeSort(x, y, tmpx,tmpy, front, mid);
            mergeSort(x, y, tmpx,tmpy,mid + 1, end);
            merge(x,y,tmpx,tmpy,front,mid,end);
        }
    }
    static void merge(int[]x, int[]y,int tmpx[],int tmpy[],int front, int mid, int end){
        for(int i =0; i< x.length; i++){
            tmpx[i] = x[i];
            tmpy[i] = y[i];
        }
        int part1 = front;
        int part2 = mid+1;
        int index = front;
        while(part1 <= mid&& part2 <=end){
            if(tmpx[part1]<tmpx[part2]){
                x[index] = tmpx[part1];
                y[index] = tmpy[part1];
                part1 ++;
            }
            else if(tmpx[part1]>tmpx[part2]){
                x[index] = tmpx[part2];
                y[index] = tmpy[part2];
                part2++;
            }
           else {
                if(tmpy[part1] <= tmpy[part2]){
                    x[index] = tmpx[part1];
                    y[index] = tmpy[part1];
                    part1++;
                }
                else{
                    x[index] = tmpx[part2];
                    y[index] = tmpy[part2];
                    part2++;
                }
            }
            index++;
        }
        for(int i = 0; i<= mid-part1; i++) {
            x[index +i] = tmpx[part1+i];
            y[index +i] = tmpy[part1+i];
        }
    }


    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[] x = new int[num];
        int[] y = new int[num];

        for(int i = 0; i < num ; i++){
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
            mergeSort(x,y);
            for(int i =0 ; i<x.length;i++){
                bw.write(x[i]+" " +y[i]+"\n");
            }
            bw.flush();

    }
}
