package com.linkedlist;

public class Element {
    private Element next;
    private Element previous;
    private String value;

    public Element(Element next, Element previous, String value) {
        this.next = next;
        this.previous = previous;
        this.value = value;
    }

    public Element(String value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
