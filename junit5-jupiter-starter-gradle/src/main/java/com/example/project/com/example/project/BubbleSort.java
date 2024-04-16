/*
 * 1. MODIFICA EL PROGRAMA PARA QUE EL ALGORITMO DE ORDENACIÓN FUNCIONE CORRECTAMENTE.
 * 2. APLICA LOS ESTÁNDARES DE CODIFICACIÓN.
 * 3. ANALIZA LOS POSIBLES BUGS EXISTENTES DEL PROGRAMA.
 * 4. ESCRIBE EL ESTADO DEL ARRAY PARA CADA ITERACIÓN DEL BUCLE EXTERNO.
 * 5. CREA LAS PRUEBAS PARA PROBAR LA CLASE MODIFICADA.
 */

package com.example.project.com.example.project;

public class BubbleSort { 
//MODIFICAMOS EL CÓDIGO PARA CUMPLIR CON LOS ESTÁNDARES DE MODIFICACIÓN, ES DECIR, EL NOMBRE DE LAS CLASES COMIENCE POR MAYUSC.

	public void bubbleSort(int arr[]) {
		
		int n = arr.length;
		
		for (int i = 0; i < n; i++) { 
		//FALTA EL ';' AL FINAL DE ESTA LÍNEA DE CÓDIGO, Y AÑADIR UN '+' EN LA 'i+'.
			
			for (int j = 0; j < n - j - 1; j++) {
			//FALTA AÑADIR UN '+' EN LA 'j+'.
				
				if (arr[j] > arr[j + 1]) { 
				 
					int temp = arr[j]; 
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp; 
				} 
			}
			
			System.out.println("Iteración con Array " + (i + 1) + ": ");
				printArray(arr);
			
		}
	}
	
	void printArray(int arr[]) {
		
		int n = arr.length;
		//MIRAMOS LA LONGITUD DEL ARRAY A MEDIR.
		
		for (int i = 0; i < n; ++i)
		//IMPRIMIR EL ELEMENTO ACTUAL DEL ARRAY A MEDIR.
			System.out.println(arr[i] + " ");
		//SIMPLEMENTE IMPRIMIMOS UNA LÍNEA PARA SEPARAR LA SALIDA POR CONSOLA.
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		
		BubbleSort ob = new BubbleSort();
		
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
			ob.bubbleSort(arr);
			//NO ES ESTRICTAMENTE NECESARIO,PERO TABULAMOS EL CÓDIGO PARA SU MAYOR LEGIBILIDAD.
			
		System.out.println("Array Ordenado :)");
	}
}
	