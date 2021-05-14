package chapter19;

public class Task_19_1 {
	/*
	 * Дан метод: 
puЬlic static int makenumber ( int n, int k) 
{ 
//Параметры: два положительных однозначных числа 
//Результат: _______________  
int num=O; 
int i=O; 
while (i<=n) 
{ 
num=numlO+k; 
i=i+ 1; 
} 
return num; 
} 
1. Укажите возвращаемое значение для следующих значений пара­
метров: n=4, k=0. Обоснуйте свой ответ с помощью таблицы трас­
сировки. 
Ответ: 0

2. Опишите, что выполняет метод. 

	 */

	public static int makenumber ( int n, int k) { 
		int num=0; 
		int i=0; 
		while (i<=n) { 
			num=num*10+k; // =0*10+0, 0, 0,
			i=i+1; // =1, 2, 3, 4
		} 
		return num; // 0, 0, 0, 0
	} 

	public static void main(String[] args) {
		System.out.println(makenumber(4, 0));
	}

}
