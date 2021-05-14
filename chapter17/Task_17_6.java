package chapter17;

public class Task_17_6 {
	/*
Дан метод: 

static int doSomething (int num) 
{ 
int s, n, temp; 
s=O; 
n=O; 
temp=num; 
while(temp>O) 
{ 
s=s+ (temp % 2); 
temp:=temp / 10; 
n=n+l; 
} 
return n-s; 
} 

1. Что будет выведено на экран, если вызов метода выглядит сле­
дующим образом: System.out.println( doSomething (1274))? Обос­
нуйте свой ответ. 
// Ответ: 2 

2. Приведите пример параметров, для которых метод будет возвра­
щать значение 3.
// Ответ: 222 

	 */
	static int doSomething (int num) { 
		int s, n, temp; 
		s=0; 
		n=0; 
		temp=num; 
		while(temp>0) { 
			s = s+(temp % 2); //=0, =0, 
			temp = temp / 10; // =4, =0, 
			n=n+1; // =1, 2, // 
		} 
		return n-s; // =2-0=2 
	} 

	public static void main(String[] args) {
		System.out.println( doSomething (222));

	}

}
