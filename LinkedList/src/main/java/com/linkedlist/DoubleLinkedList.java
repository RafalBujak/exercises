package com.linkedlist;


public class DoubleLinkedList  {

    private Element head;
    private Element tail;
    private int count = 0;


    private void setFirst(String element) {

        Element first = head;
        Element newElement = new Element(first, null, element);
        head = newElement;
        if (first == null)
            tail = newElement;
        else
            first.setPrevious(newElement);
        count++;
    }

    private void setLast(String element) {
        Element last = tail;
        Element newElement = new Element(null, last,  element);
        last = newElement;
        if (last == null)
            head = newElement;
        else
            last.setNext(newElement);
        count++;
    }

    public void addFirst(String element) {

        setFirst(element);}

    public void addLast(String element) {setLast(element);}

    public void showSize() {
        System.out.println(count);
    }
}
