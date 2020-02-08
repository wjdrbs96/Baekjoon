package Baekjoon.Java.BOJ1900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TreeNode {
    char data;
    TreeNode left;
    TreeNode right;

    public TreeNode(char data) {
        this.data = data;
    }
}

class Tree {
    TreeNode root;

    public Tree(char data, char left, char right) {   //90번 째 줄 때 노드 3개 만들어짐

        if (data == '.') {
            root = new TreeNode(data);
        }
        if (data != '.') {
            root = new TreeNode(data);
        }
        if (left != '.') {
            root.left = new TreeNode(left);
        }
        if (right != '.') {
            root.right = new TreeNode(right);
        }
    }

    public void add(char data, char left, char right) {   // 노드를 추가하는 메소드
        next(root.left, data, left, right);
        next(root.right, data, left, right);
    }

    public void next(TreeNode node, char data, char left, char right) {
        if (node == null) {   // 노드가 . 이라면 존재하지 않을테니 return
            return;
        }

        if (node.data == data) {        // if 문이 있는 이유가 뭘까..
            if (left != '.') {
                node.left = new TreeNode(left);
            }
            if (right != '.') {
                node.right = new TreeNode(right);
            }
        } else {
            next(node.left, data, left, right);
            next(node.right, data, left, right);
        }
    }

    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data);
            inOrder(node.right);
        }
    }

    public void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data);
        }
    }
}

public class Main_1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] data = br.readLine().replaceAll(" ", "").toCharArray();

        Tree root = new Tree(data[0], data[1], data[2]);   //  루트노드 따로 빼 놓기

        for (int i = 1; i < n; ++i) {
            data = br.readLine().replaceAll(" ","").toCharArray();
            root.add(data[0], data[1], data[2]);
        }

        root.preOrder(root.root);
        System.out.println();
        root.inOrder(root.root);
        System.out.println();
        root.postOrder(root.root);
    }
}
