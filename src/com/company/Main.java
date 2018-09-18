package com.company;

/*
Given a BST and a number. The task is to check whether the given number is
equal to the sum of all the node from root leaf across any of the root to
leaf paths in the given Binary Search Tree.
@author:Saptarshi Polley
@Date: 18/09/2018
 */

//Class for a Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
//Class for a tree
class BTree {
    Node root;

    BTree() {
        this.root = null;
    }

    BTree(Node root) {
        this.root = root;
    }
    // Static method to add a Node in the tree;
    public static void add(Node root, int d) {
        if (root == null) {
            root = new Node(d);
        } else {
            if (root.data > d) {
                if (root.left == null)
                    root.left = new Node(d);
                else {
                    add(root.left, d);
                }
            } else {
                if (root.right == null)
                    root.right = new Node(d);
                else {
                    add(root.right, d);
                }
            }
        }
    }
    /*
    This is a recursive function that will traverse from root to leaf and check if there is any path that having the
    Target Sum. It will use the recursion stack to store the value of the sum for the path from the root to each node. Reaching at the leaf it will
    check if the sum throught the path from root is equal to target sum.
     */
    public static boolean checkTheSum(Node root, int target, int sum) {

        if (root == null)
            return false;

        //updating sum for the node.
        sum = sum + root.data;

        //if the node is a leaf
        if (root.left == null && root.right == null) {
            System.out.println(sum);
            if (sum == target)
                return true;
            else
                return false;
        }
        //else traverse down
        return checkTheSum(root.left, target, sum) || checkTheSum(root.right, target, sum);
    }
}


public class Main {

    public static void main(String[] args) {
        // write your code here
        Node root = new Node(45);

        BTree bTree = new BTree(root);

        root = bTree.root;

        BTree.add(root, 50);
        BTree.add(root, 47);
        BTree.add(root, 52);
        BTree.add(root, 46);
        BTree.add(root, 48);
        BTree.add(root, 51);
        BTree.add(root, 55);
        BTree.add(root, 38);
        BTree.add(root, 33);
        BTree.add(root, 41);
        BTree.add(root, 31);
        BTree.add(root, 35);
        BTree.add(root, 40);
        BTree.add(root, 44);
        //Checking if there is a target sum in the tree.
        System.out.print(BTree.checkTheSum(root, 198, 0));
    }
}
