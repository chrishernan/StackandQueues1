package com.company;

/**
 * Created by christian.hernandez on 6/19/17.
 */
public class Stack {

    Node head;
    int size;

    public Stack() {size = 0;}

    public String pop() {
        if(size<0){throw new IndexOutOfBoundsException();}

        if(size==0){ throw new IndexOutOfBoundsException();}
        else {
            Node temp_head = head;
            head = head.previous;
            size--;
            return temp_head.data;
        }
    }

    public void push(String new_node_data) {
        if(size<0){throw new IndexOutOfBoundsException();}

        if(size==0){
            Node temp_node = new Node(new_node_data);
            head = temp_node;
            head.previous = null;
            size++;
        }
        else {
            Node temp_head = head;
            head = new Node(new_node_data);
            head.previous=temp_head;
            size++;
        }

    }

    public String peek() {
        return head.data;
    }

    public int get_size() {
        return this.size;
    }
}
