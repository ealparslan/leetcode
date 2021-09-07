package com.ea.interviews.leetcode;

import java.util.LinkedList;

public class ValidParanthesis20 {

    public static void main(String[] args){

        String input = "[[";
        input = input.replaceAll("[a-zA-Z]", "");

        System.out.println(valid(input));




    }


    private static boolean valid(String input){
        if (input.length() == 1) return false;

        char[] chars = input.toCharArray();
        Node head = new Node(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if(c == '(' || chars[i] == '[' || chars[i] == '{'){
                head.next = new Node(chars[i]);
                Node prev = head;
                head = head.next;
                head.prev = prev;
            }
            else if(c == ')'){
                if(head.val != '(')
                    return false;
                else if(head.prev != null){
                    Node next = head;
                    head = head.prev;
                    head.next = next;
                }
            }
            else if(c == ']'){
                if(head.val != '[')
                    return false;
                else if(head.prev != null){
                    Node next = head;
                    head = head.prev;
                    head.next = next;
                }
            }
            else if(c == '}'){
                if(head.val != '{')
                    return false;
                else if(head.prev != null){
                    Node next = head;
                    head = head.prev;
                    head.next = next;
                }
            }
        }
        if(head.prev != null)
            return false;
        return true;
    }

    static class Node{
        char val;
        Node next;
        Node prev;

        public Node(char val){
            this.val = val;
        }
    }

}
