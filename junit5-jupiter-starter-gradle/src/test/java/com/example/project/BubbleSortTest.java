package com.example.project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import com.example.project.com.example.project.BubbleSort;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        BubbleSort obj = new BubbleSort();
        //INSTANCIAR LA CLASE BUBBLESORT
        
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        //OTORGAMOS UN ARRAY DESORDENADO
        
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        //ESTABLECEMOS EL ORDEN BUSCADO
        
        obj.bubbleSortMetodo(arr);
        //LE PEDIMOS QUE ORDENE EL ARRAY DESORDENADO
        
        obj.printArray(arr);
        //IMPRIMIMOS EL ARRAY 'arr' ANTES DE HACER LA COMPROBACIÓN
        
        obj.printArray(expected);
        //IMPRIMIMOS EL ARRAY 'expected' ANTES DE HACER LA COMPROBACIÓN
        
        assertArrayEquals(expected, arr);
        //HACMOS COMPARACIÓN ENTRE EL ARRAY ORDENADO DE FORMA MANUAL Y EL QUE NOS DA EL PROGRAMA
    }

    @Test
    public void testBubbleSortWithEmptyArray() {
        BubbleSort obj = new BubbleSort();
        int[] arr = {};
        int[] expected = {};
        obj.bubbleSortMetodo(arr);
        obj.printArray(arr);
        obj.printArray(expected);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray() {
        BubbleSort obj = new BubbleSort();
        int[] arr = { 11, 12, 22, 25, 34, 64, 90 };
        int[] expected = { 11, 12, 22, 25, 34, 64, 90 };
        obj.bubbleSortMetodo(arr);
        obj.printArray(arr);
        obj.printArray(expected);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithSingleElementArray() {
        BubbleSort obj = new BubbleSort();
        int[] arr = { 5 };
        int[] expected = { 5 };
        obj.bubbleSortMetodo(arr);
        obj.printArray(arr);
        obj.printArray(expected);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortWithDuplicateElements() {
        BubbleSort obj = new BubbleSort();
        int[] arr = { 5, 5, 3, 3, 1, 1 };
        int[] expected = { 1, 1, 3, 3, 5, 5 };
        obj.bubbleSortMetodo(arr);
        obj.printArray(arr);
        obj.printArray(expected);
        assertArrayEquals(expected, arr);
    }
}
