package com.ea.interviews.leetcode;

public class BinarySearchTree<T extends Comparable<T>> {

    TreeNode<T> root;

    BinarySearchTree(T val){
        root = new TreeNode<>(null,null ,val );
    }

    public void insert(T val){
        insertNode(val, root);
    }

    public TreeNode search(T val){
        return searchNode(val,root );
    }

//    public TreeNode remove(T val){
//
//    }

    private void insertNode(T val, TreeNode<T> node){
        if(val.compareTo(node.value)<0){
            if(node.left!=null)
                insertNode(val,node.left );
            else
                node.left = new TreeNode(null,null ,val );
        }
        else if(val.compareTo(node.value)>0){
            if(node.right!=null)
                insertNode(val,node.right );
            else
                node.right = new TreeNode(null,null ,val );
        }
        else
            return;
    }

    private TreeNode searchNode(T val, TreeNode<T> node){
        if(node.value.compareTo(val)==0)
            return node;
        else if(node.value.compareTo(val) > 0)
            return searchNode(val, node.left);
        else
            return searchNode(val,node.right );
    }
}

class TreeNode<T>{
    TreeNode left;
    TreeNode right;
    public TreeNode(TreeNode<T> left, TreeNode<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
    T value;
}
