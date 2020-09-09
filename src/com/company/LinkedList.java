package com.company;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;


        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int count;

        public void addLast(int item) {
            var node = new Node(item);

            if(first == null)
                first = last = node;
            else {
                last.next = node;
                last = node;
            }

        }

        public void addFirst(int item) {
            var node = new Node(item);

            if(first == null)
                first = last = node;
            else {
                first = node;
            }

        }

        public int indexOf(int item) {
            for(int i = 0; i < count; i++) {
                if (i == item) {
                    return i;
                }
            }

            return item;
        }
}
