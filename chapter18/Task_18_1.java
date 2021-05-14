package chapter18;

import java.util.Arrays;

public class Task_18_1 {
	/*
 В заданиях № 1-8 используется следующее описание массива: 
int n=5; 
int[] а = new int[n]; 

Укажите, какие значения будет содержать массив, после выполнения 
следующего блока: 
for(i=0; i<n; i++) 
a[i]=i(i+ 1); 

// Ответ: [0, 2, 6, 12, 20]

	 */

	public static void main(String[] args) {
		int n=5; 
		int[] a = new int[n]; 

		for(int i=0; i<n; i++) 
			a[i] = i*(i+ 1); 
		
		System.out.println(Arrays.toString(a));

	}

}
