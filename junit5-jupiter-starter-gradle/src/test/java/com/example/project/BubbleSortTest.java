package com.example.project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.example.project.com.example.project.BubbleSort;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithEmptyArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {};
        int[] expected = {};
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = { 11, 12, 22, 25, 34, 64, 90 };
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithSingleElementArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = { 5 };
        int[] expected = { 5 };
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithDuplicateElements() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = { 5, 5, 3, 3, 1, 1 };
        int[] expected = { 1, 1, 3, 3, 5, 5 };
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }
}
