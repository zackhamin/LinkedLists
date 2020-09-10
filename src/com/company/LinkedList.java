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
    private boolean containsTrue = true;

//        public void addLast(int item) {
//            var node = new Node(item);
//
//            if(first == null)
//                first = last = node;
//            else {
//                last.next = node;
//                last = node;
//            }
//        }
        public void addFirst(int item) {
            var node = new Node(item);

            if(first == null)
                first = last = node;
            else {
                node.next = first;
                first = node;
            }

        }

        public int indexOfNumber(int item) {
            for(int i = 0; i < count; i++) {
                if (i == item) {
                    return i;
                }
            }
            return -1;
        }

        public boolean contains(int item) {
            for(int i = 0; i < count; i++)
                if(i == item) {
                    return containsTrue;
                }
            return false;
        }

        public void removeFirst(){


        }
}
