package chapter17;

public class Task_17_4 {
	/*
Дан метод: 

int what (int num, int d) 
{ 
int g= 0; 
if(num>99) 
num=num%100; 
if(num % 10 = = d) 
g++; 
if (num /10 = = d) 
g++; 
return g; 
} 

1. Какое значение возвращает метод, если его вызов выглядит сле­
дующим образом: x=what (1235,3)? Обоснуйте свой ответ. 
// Ответ - 1.
  | g  | num  | d    | x   | return g
1 | 0  | 1235 | 3    |     |
2 | 1  | 35   |      |     | 1

2. Приведите пример параметров, для которых метод будет возвра­
щать значение 2. 
// Ответ: x = what(55,5);

3. Приведите пример параметров, для которых метод будет возвра­
щать значение 0. 
// Ответ: x = what(555,6);

	 */

	static int what (int num, int d) { 
		int g=0; 
		if(num>99) 
			num=num%100; 
		if(num%10==d) 
			g++; 
		if (num/10==d) 
			g++; 
		return g; 
	} 

	public static void main(String[] args) {
		int x;
		x = what(555,6);
		System.out.println(x);

	}

}
