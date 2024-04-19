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

public void bubbleSortMetodo(int arr[]) {
		
		int n = arr.length;
		
		for (int i = 0; i < n; i++) { 
		//FALTA EL ';' AL FINAL DE ESTA LÍNEA DE CÓDIGO, Y AÑADIR UN '+' EN LA 'i+'.
			
			for (int j = 0; j < n-1; j++) {
			//FALTA AÑADIR UN '+' EN LA 'j+'.
				
				if (arr[j] > arr[j + 1]) { 
				 
					int temp = arr [j]; 
					arr [j] = arr [j + 1]; 
					arr [j + 1] = temp; 
				} 
			}
			
			System.out.print("Iteración con Array " + (i + 1) + ": ");
				printArray(arr);
			
		}
	}
/* 
	n = 7 (LONGITUD DEL ARRAY)
	i = 0 (VALOR DEL FOR EXTERNO)
	j = 0 (VALOR DEL FOR INTERNO)
	
	64, 34, 25, 12, 22, 11, 90
*/
	public void printArray(int arr[]) {
		
		int n = arr.length;
		//MIRAMOS LA LONGITUD DEL ARRAY A MEDIR.
		
		for (int i = 0; i < n; ++i)
		//IMPRIMIR EL ELEMENTO ACTUAL DEL ARRAY A MEDIR.
			System.out.print(arr[i] + " ");
		//SIMPLEMENTE IMPRIMIMOS UNA LÍNEA PARA SEPARAR LA SALIDA POR CONSOLA.
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		
		BubbleSort ob = new BubbleSort();
		
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
			ob.bubbleSortMetodo(arr);
			//NO ES ESTRICTAMENTE NECESARIO,PERO TABULAMOS EL CÓDIGO PARA SU MAYOR LEGIBILIDAD.
			
		System.out.print("Array Ordenado :)");
	}
}