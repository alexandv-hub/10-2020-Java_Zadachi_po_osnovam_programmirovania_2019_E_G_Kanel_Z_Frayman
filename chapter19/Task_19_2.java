package chapter19;

import java.util.Arrays;

public class Task_19_2 {
	/*
	 Задание 19.2 
public static int what (int[] а, int k) 
{ 
int i, s=O; 
for (i=O;i<k;i=i+2) 
s=s+a[i]; 
} 
return s; 

1. Что возвращает метод, если получает в качестве параметров мас­
сив (3, 5, 6, 7, 3, 9, 1, 6) и переменную k=5? Обязательно использо­
вать таблицу трассировки. 

2. Опишите, что выполняет метод. 
	 */
	public static int what (int[] a, int k) { 
		int i, s=0; 
		for (i=0; i<k; i=i+2) { 
			s=s+a[i]; // = 0+3=3, 3+6=9, 9+3=12 
		System.out.println(s);
		}
		return s; 
	} 


	public static void main(String[] args) {
		int []a = {3, 5, 6, 7, 3, 9, 1, 6}; 
		int k=5;
		System.out.println(Arrays.toString(a));
		int z = what(a, k);
		System.out.println(z);

	}

}
