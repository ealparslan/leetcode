package com.ea.interviews.leetcode;


// 1

import java.util.ArrayList;
import java.util.HashMap;

public class TreeNodeTraversal {

    HashMap<Integer,ArrayList<Integer>> layers = new HashMap<>();
    TreeNode a = new TreeNode(null,null ,9 );
    TreeNode b = new TreeNode(null,null ,6 );
    TreeNode c = new TreeNode(null,null ,25 );
    TreeNode d = new TreeNode(null,null ,27 );

    public TreeNode init(){
        return new TreeNode(
                new TreeNode(a, b, 7),
                new TreeNode(c, d, 8),
                3
        );
    }

    public void traverse(TreeNode node, int upLayer){
        if(null == node) return;
        upLayer ++;
        ArrayList<Integer> subs = new ArrayList<>();
        if(upLayer%2 == 0){
            if(null != node.left) subs.add(node.left.value);
            if(null != node.right) subs.add(node.right.value);
        }
        else {
            if(null != node.right) subs.add(node.right.value);
            if(null != node.left) subs.add(node.left.value);
        }

        if(null == layers.get(upLayer))
            layers.put(upLayer,subs );
        else
            layers.get(upLayer).addAll(subs);
        traverse(node.left,upLayer);
        traverse(node.right,upLayer);
    }

    class TreeNode{
        TreeNode left;
        TreeNode right;

        public TreeNode(TreeNode left, TreeNode right, Integer value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        Integer value;
    }

}
