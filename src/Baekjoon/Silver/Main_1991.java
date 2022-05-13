package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1991 {
    static List<Node>[] list;
    static StringBuilder sb = new StringBuilder();
    static class Node{
        int left;
        int right;

        public Node(int left, int right){
            this.left = left;
            this.right = right;
        }
    }


    static void preorder(int start){
        for(Node node: list[start]){
            int left = node.left;
            int right = node.right;

            sb.append((char)(start + 'A' - 1));
            if (left != -18){
                preorder(left);
            }
            if (right != -18){
                preorder(right);
            }
        }
    }

    static void inorder(int start){
        for(Node node: list[start]){
            int left = node.left;
            int right = node.right;

            if (left != -18){
                inorder(left);
            }
            sb.append((char)(start + 'A' - 1));


            if (right != -18){
                inorder(right);
            }
        }
    }

    static void postorder(int start){
        for(Node node: list[start]){
            int left = node.left;
            int right = node.right;

            if (left != -18){
                postorder(left);
            }
            if (right != - 18){
                postorder(right);
            }
            sb.append((char)(start + 'A' - 1));
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        list = new ArrayList[n+1];

        for(int i = 1; i < n+1; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 1; i < n+1; i++){
            st = new StringTokenizer(br.readLine());
            int node = st.nextToken().charAt(0) - 'A' + 1;
            int left = st.nextToken().charAt(0) - 'A' + 1;
            int right = st.nextToken().charAt(0) - 'A' + 1;

            list[node].add(new Node(left, right));
        }


        preorder(1);
        sb.append("\n");
        inorder(1);
        sb.append("\n");
        postorder(1);

        System.out.println(sb);

    }
}
