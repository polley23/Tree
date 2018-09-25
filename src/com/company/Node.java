package com.company;

//Class for a Node
public class Node {
    private int data;
    private Node left;
    private Node right;

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        if(this.left!=null)
            this.left = left;
        else
            this.left = new Node(left.getData());
    }

    public void setRight(Node right) {
        if(this.right != null)
            this.right = right;
        else
            this.right = new Node(right.getData());
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
