package Baekjoon.Silver;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_5904 {
    static Serializable moo(int n, int stop, ArrayList<Character>list){
        int count = 0;
        if(n ==0){
            list.add('m');
            for(int i =0; i<n+2;i++) list.add('o');
            return list;
        }
        else {
            moo(n-1,stop,list);
            list.add('m');
            for(int i =0; i<n+2;i++) list.add('o');
            moo(n-1,stop,list);
            if(list.size()>stop) {
                return list.get(stop-1);
            }
            return list;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int stop = sc.nextInt();
        ArrayList<Character> list = new ArrayList<Character>();
        char[] stack = new char[1000000000];
        System.out.println(moo(20,stop,list));
        System.out.println(list.size());
    }
}
