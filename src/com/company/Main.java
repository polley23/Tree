package com.company;

/*
Given a BST and a number. The task is to check whether the given number is
equal to the sum of all the node from root leaf across any of the root to
leaf paths in the given Binary Search Tree.
@author:Saptarshi Polley
@Date: 18/09/2018
 */

import com.company.avl.AVLTree;

import java.util.Map;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Node root = new Node(90);

        AVLTree AVLTree = new AVLTree(root);

        root = AVLTree.root;
        //System.out.println("Inserting 1");
        AVLTree.root=AVLTree.add(AVLTree.root, 80);
        //AVLTree.inorder(AVLTree.root);
       // System.out.println("Inserting 2");
        AVLTree.root=AVLTree.add(AVLTree.root, 70);
        //AVLTree.inorder(AVLTree.root);
        //System.out.println("Inserting 3");
        AVLTree.root=AVLTree.add(AVLTree.root, 60);
        //AVLTree.inorder(AVLTree.root);
        //System.out.println("Inserting 4");
        AVLTree.root=AVLTree.add(AVLTree.root, 50);
        //System.out.println("Inserting 5");
        AVLTree.root=AVLTree.add(AVLTree.root, 40);
        //System.out.println("Inserting 6");
        AVLTree.root=AVLTree.add(AVLTree.root, 30);
        //System.out.println("Inserting 7");
        AVLTree.root=AVLTree.add(AVLTree.root, 20);
//        AVLTree.add(root, 38);
//        AVLTree.add(root, 33);
//        AVLTree.add(root, 41);
//        AVLTree.add(root, 31);
//        AVLTree.add(root, 35);
//        AVLTree.add(root, 40);
//        AVLTree.add(root, 44);
        //Checking if there is a target sum in the tree.
        //System.out.print(AVLTree.checkTheSum(root, 198, 0));
        int ans=0;

        System.out.println(AVLTree.getHeight(AVLTree.root));
        System.out.println(AVLTree.root.getData());
        AVLTree.inorder(AVLTree.root);

    }
}
