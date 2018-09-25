package com.company.Btree;

import com.company.Node;

//Class for a tree
public class BTree {
    public Node root;
    public static int d;
    public BTree() {
        this.root = null;
    }

    public BTree(Node root) {
        this.root = root;
        d=0;
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

        }
        return root;
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
        sum = sum + root.getData();

        //if the node is a leaf
        if (root.getLeft() == null && root.getRight() == null) {
            System.out.println(sum);
            if (sum == target)
                return true;
            else
                return false;
        }
        //else traverse down
        return checkTheSum(root.getLeft(), target, sum) || checkTheSum(root.getRight(), target, sum);
    }
    public static int getHeight(Node root){
        if(root==null)
            return 0;
        int leftheight = getHeight(root.getLeft());
        int rightheight=getHeight(root.getRight());
        if(leftheight>=rightheight)
            return leftheight+1;
        else
            return rightheight+1;

    }
    public static int getDiameter(Node root){
        if(root==null)
            return 0;
        int leftd = getDiameter(root.getLeft());
        int rightd = getDiameter(root.getRight());

        int leftheight = getHeight(root.getLeft());
        int rightheight= getHeight(root.getRight());
        int d=leftheight+rightheight+1;
        return Math.max(Math.max(leftd,rightd),d);

    }
    public static void inorder(Node root){
        if(root==null)
            return;
        inorder(root.getLeft());
        System.out.print(root.getData()+" ");
        inorder(root.getRight());
    }
}
