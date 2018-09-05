package com.ea.interviews.leetcode;

public class DiameterofBinaryTree543 {

    static int diameter = 0;

    public static void main(String[] args){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(7);
        diameter(tree.root);

        System.out.println(diameter);


    }

    private static int diameter(TreeNode root){

        int leftDepth = root.left == null ? 0 : diameter(root.left);
        int rightDepth = root.right == null ? 0 : diameter(root.right);

        diameter = leftDepth+rightDepth > diameter ? leftDepth+rightDepth : diameter;

        return leftDepth > rightDepth ? leftDepth+1 : rightDepth+1;
    }

}
