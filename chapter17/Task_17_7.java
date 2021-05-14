package chapter17;

public class Task_17_7 {
	/*
Дан метод:

static int secret(int num) 
{ 
int temp; 
if(num<50){ 
while(num>2)num=num-2; 
} 
else{ 
while(num<lOO) num=num+2; 
} 
if(num==211 num=lOO) temp=l; 
else temp= О; 
retumtemp; 
} 

1. Что будет выведено на экран, если вызов метода выглядит еле-­
дующим образом: 
 System.out.println(secret(lO))? Обоснуйте 
свой ответ. 
// Ответ: 1

2. Что будет выведено на экран, если вызов метода выглядит сле­
дующим образом: System.out.println( secret(5))? Обоснуйте свой 
ответ. 
// Ответ: 0

3. Что будет выведено на экран, если вызов метода выглядит сле­
дующим образом: System.out.println(secret(88))? Обоснуйте 
свой ответ. 
// Ответ: 0
	 */

	static int secret(int num) { 
		int temp; 
		
		if (num<50) { 
			while (num>2) 
				num=num-2; // 8, 6, 4, 2  // 3, 1  
		} 
		else { 
			while(num<100) 
				num=num+2; // 90, 92, 94, 96, 98, 100
		} 
		
		if (num==2 || num==100) 
			temp=1;  // 1  // 1
		else temp= 0; // 0 
		return temp;  // 1  // 0  // 1
	} 

	public static void main(String[] args) {

		System.out.println(secret(88));

	}

}
