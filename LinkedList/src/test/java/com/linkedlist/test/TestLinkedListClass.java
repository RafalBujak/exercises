package com.linkedlist.test;

import com.linkedlist.DoubleLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void deleteLinkedListElementTest() {
        //Given
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add("test");
        doubleLinkedList.add("test1");
        doubleLinkedList.add("new");
        doubleLinkedList.add("ddd");

        //when
        doubleLinkedList.delete("test1");

        //then
        assertEquals(3, doubleLinkedList.getSize());
        assertEquals("test", doubleLinkedList.get(0));
        assertEquals("new", doubleLinkedList.get(1));
        assertEquals("ddd", doubleLinkedList.get(2));

    }

    @Test
    public void containElementInTheLinkedListTest() {
        //Given
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add("test");
        doubleLinkedList.add("test1");
        doubleLinkedList.add("new");
        doubleLinkedList.add("ddd");

        //when
        boolean result = doubleLinkedList.contains("ddd");
        boolean result2 = doubleLinkedList.contains("test");
        boolean result3 = doubleLinkedList.contains("test1");
        boolean result4 = doubleLinkedList.contains("new");
        boolean result5 = doubleLinkedList.contains("test111");

        //then
        assertEquals(4, doubleLinkedList.getSize());
        assertTrue(result);
        assertTrue(result2);
        assertTrue(result3);
        assertTrue(result4);
        assertTrue(!result5);
    }


    @Test
    public void getElementFromLinkedListTest() {
        //Given
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add("test");
        doubleLinkedList.add("test1");
        doubleLinkedList.add("new");
        doubleLinkedList.add("ddd");

        // when
        // then
        assertEquals(4, doubleLinkedList.getSize());
        assertEquals("test1", doubleLinkedList.get(1));
    }

    @Test
    public void sizeLinkedListTest() {
        //Given
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add("test");
        doubleLinkedList.add("test1");
        doubleLinkedList.add("new");
        doubleLinkedList.add("ddd");
        doubleLinkedList.add("ddd");
        doubleLinkedList.add("ddd");
        doubleLinkedList.add("ddd");

        // when
        // then
        assertEquals(7, doubleLinkedList.getSize());
    }
}
