package com.ea.interviews.leetcode;

public class Queue<T> {

    Node<T> head;
    Node tail;

    Queue(Node ht){
        head = tail = ht;
    }

    public Node enqueue(T val){
        Node oldTail = tail;
        tail = new Node(val);
        oldTail.next = tail;
        return tail;
    }

    public Node dequeue(){
        Node oldHead = head;
        head = head.next;
        return oldHead;
    }

}
