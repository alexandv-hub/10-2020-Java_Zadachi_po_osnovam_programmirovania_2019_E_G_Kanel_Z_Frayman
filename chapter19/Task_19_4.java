package chapter19;

public class Task_19_4 {
	/*
	 Дан метод: 
public static int check(int num) 
{ 
temp=num%10; 
num=num/10; 
while (num>O) 
{ 
if (temp+ 1 !=num%10) return О; 
else 

} 
temp=num%10; 
num=num/10; 
} 

{ 
return 1;
} 


1. Используйте таблицу трассировки и укажите, что выведет на эк­
ран следующая команда, использующая вызов метода: 
System.out. println(what(9876)); 

2. Используйте таблицу трассировки и укажите, что выведет на эк­
ран следующая команда, использующая вызов метода: 
System.out. println(what( 17)); 

3. Приведите пример параметра, при котором метод возвращает 1. 

4. Приведите пример параметра, при котором метод возвращает О. 

5. Сформулируйте, что выполняет метод. 
	 */

	public static int check(int num) { 
		int temp=num%10; // = 6, // 7
		num=num/10; // 987, // = 1
		while (num>0) { 
			if (temp+1 != num%10) // 7 != 7 = false, 8 != 8 = false, 9 != 9 = false, // 8 != 1 = true
				return 0; // 0
			else {
				temp=num%10; // 7, 8, 9
				num=num/10; // 98, 9, 0
			}
		} 
		return 1; // 1 
	} 

	public static void main(String[] args) {
		System.out. println(check(17)); 
	}

}
