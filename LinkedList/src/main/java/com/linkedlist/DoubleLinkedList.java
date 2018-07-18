package com.linkedlist;




public class DoubleLinkedList {

    private Element head;
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
        // Fix problem with deleting elements in two methods by object String and index

        if (head != null) {
            Element element1 = head;
            while (element1.getNext() != null) {
                element1 = element1.getNext();
                if (element1.getValue().equals(element)) {

                }
            }
            System.out.println(element1.getValue());

        }
        size--;
    }


    public void deleteByIndex(int index) {
        int x = 0;
        Element element = head;
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        while (x < index) {
            element = element.getNext();
            if (x == index) {
                delete(element.getValue());
            }
            x++;
        }

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
        Element element1 = head;

        if (element1.getValue().equals(element)) {
            return true;
        } else {
            while (element1.getNext() != null) {
                element1 = element1.getNext();
                if (element1.getValue().equals(element)) {
                    return true;
                }

            }
            return false;
        }
    }

    public int getSize() {
        return size;
    }

}
