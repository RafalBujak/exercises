package com.linkedlist;


public class DoubleLinkedList {

    private Element head;
    //private Element tail;
    private int size = 0;

    public void add(String value) {

        if (head == null) {
            head = new Element(value);
        } else {
            Element element = head;
            while (element.getNext() != null) {
                element = element.getNext();
            }
            Element newElement = new Element(value);
            element.setNext(newElement);
            newElement.setPrevious(element);
        }
        size++;
    }

    public void delete(String element) {
        //TODO
        // 2 wersja za pomoca int
        //Element element1 = head;
        while (head.getNext() != null) {
            if (head.getValue().equals(element)) {
                delete(element);
            }
        }
        size--;
    }

    public String get(int index) {
        int x = 0;
        Element element = head;
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        while (x < index) {
            element = element.getNext();
            x++;
        }
        return element.getValue();
    }

    public boolean contains(String element) {
        // return information if some element exist in the list
        return true;
    }
    // napisz testy

    public int getSize() {
        return size;
    }
}
