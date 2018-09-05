package com.ea.interviews.leetcode;

public class Stack<T> {

    Node head;

    Stack(Node h){
        head = h;
    }

    public Node push(T val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public Node pop(){
        Node oldHead = head;
        head = head.next;
        return oldHead;
    }
}

