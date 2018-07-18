package com.linkedlist.test;

import com.linkedlist.DoubleLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLinkedListClass {

    @Test
    public void addLinkedListTest() {
        //Given
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add("new test");
        doubleLinkedList.add("new test1");
        doubleLinkedList.add("new");

        // when
        // then
        assertEquals(3, doubleLinkedList.getSize());
        assertEquals("new test1", doubleLinkedList.get(1));

    }
}
