package Baekjoon.Silver;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_10989 {
    static void mergeSort(int[]arr){
        int[] tmp = new int[arr.length];
        mergeSort(arr,tmp,0,arr.length-1);
    }
    static void mergeSort(int[] arr,int [] tmp,int front, int end){
        if(front<end) {
            int mid = (front + end) / 2;
            mergeSort(arr, tmp, front, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, front, mid, end);
        }
    }
    static void merge(int[] arr,int[]tmp, int front, int mid,int end){
        for(int i =front; i<=end; i++){
            tmp[i] = arr[i];
        }
        int index = front;
        int part1 = front;
        int part2 = mid+1;

        while(part1 <=mid &&part2 <=end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        for(int i = 0; i<=mid-part1;i++){
            arr[index+i] =tmp[part1+i];
        }
    }
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr);
        for(int i =0; i<n; i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
