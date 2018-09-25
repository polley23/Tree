package com.company.avl;

import com.company.Btree.BTree;
import com.company.Node;

public class AVLTree extends BTree {
    public AVLTree(Node root) {
        super(root);

    }
    // Static method to add a Node in the tree;
    public static Node add(Node root, int d) {
        if (root == null) {
            return new Node(d);
        }
        else {
            if (root.getData() > d) {
                root.setLeft(add(root.getLeft(),d));
            } else {
                root.setRight(add(root.getRight(),d));
            }
            if(Math.abs(getHeight(root.getLeft())
                    -getHeight(root.getRight())) > 1 )
            {
                if(getHeight(root.getLeft())
                        -getHeight(root.getRight()) > 1){
                    if(getHeight(root.getLeft().getLeft())-getHeight(root.getLeft().getRight())>0){
                        Node temp = root;
                        root=root.getLeft();
                        temp.setLeft(root.getRight());
                        root.setRight(temp);
                    }
                    else {
                        Node temp = root.getLeft();
                        root.setLeft(temp.getRight());
                        temp.setRight(root.getLeft().getLeft());
                        root.getLeft().setLeft(temp);
                        temp = root;
                        root=root.getLeft();
                        temp.setLeft(root.getRight());
                        root.setRight(temp);
                    }



                }
                else{
                    //right right
                    if(getHeight(root.getRight().getRight())-getHeight(root.getRight().getLeft())>0){
                        //System.out.print("Hello");
                        Node temp = root;
                        root=root.getRight();
                        temp.setRight(root.getLeft());
                        root.setLeft(temp);
                        //System.out.print("root: "+root.getLeft().getData()+" ");
                        //System.out.println(root.hashCode());

                    }
                    else {
                        Node temp = root.getRight();
                        root.setRight(temp.getLeft());
                        temp.setLeft(root.getRight().getRight());
                        root.getRight().setRight(temp);
                        temp = root;
                        root=root.getRight();
                        temp.setRight(root.getLeft());
                        root.setLeft(temp);

                    }


                }

            }


        }
        return root;
    }
}
