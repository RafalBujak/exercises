package com.linkedlist;


public class DoubleLinkedList {

    private Element head = null;
    private Element tail;
    private int count = 0;



    private void setFirst(Element element) {

        Element first = head;
        Element last = new Element(null, element, first.toString());
        head = last;
        if (first == null)
            tail = last;
        else
            first.setPrevious(last);
        count++;
    }

    private void setLast(Element element) {
        Element last = tail;
        Element newElement = new Element(last, element, null);
        last = newElement;
        if (last == null)
            head = newElement;
        else
            last.setNext(newElement);
        count++;
    }

    public void addFirst(Element element) {setFirst(element);}

    public void addLast(Element element) {setLast(element);}

}
