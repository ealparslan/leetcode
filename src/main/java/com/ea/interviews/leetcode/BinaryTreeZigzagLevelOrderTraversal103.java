package com.ea.interviews.leetcode;

import java.util.*;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeZigzagLevelOrderTraversal103 {

    public static void main(String[] args) {

        BinarySearchTree<Integer> tree = new BinarySearchTree<>(7);
        tree.insert(6);
        tree.insert(5);
        tree.insert(8);
        tree.insert(9);

        List<List<Integer>> a = zigzagLevelOrder(tree.root);
        System.out.println(0);
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = 0;
        List<List<Integer>> listList = new ArrayList<>();

        Queue<Stack<TreeNode>> queue = new LinkedList<>();
        Stack<TreeNode> rootList = new Stack<>();
        rootList.add(root);
        queue.add(rootList);

        while (!queue.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            Stack<TreeNode> nodes = queue.remove();
            Stack<TreeNode> nodeList = new Stack<>();
            while (!nodes.isEmpty()){
                TreeNode<Integer> node = nodes.pop();
                levelList.add(node.value);
                if(level%2==0){
                    if(node.left!=null) nodeList.push(node.left);
                    if(node.right!=null) nodeList.push(node.right);
                }
                else {
                    if(node.right!=null) nodeList.push(node.right);
                    if(node.left!=null) nodeList.push(node.left);
                }
            }

            if(nodeList.size() > 0)
                queue.add(nodeList);
            listList.add(levelList);
            level++;
        }

        return listList;
    }


}
