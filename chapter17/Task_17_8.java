package chapter17;

public class Task_17_8 {
	/*
	 * Напишите метод, который принимает в качестве параметра число и 
возвращает: 
• -1 - в случае если число отрицательное; 
• О - в случае если число равно О; 
• 1 - в случае если число положительное. 
	 */
	
	static int method (int num) {
		int s=0; 
		if (num<0)
			s = -1;
		if (num==0)
			s = 0;
		if (num>0)
			s = 1;
		return s;
	}

	public static void main(String[] args) {
	
		System.out.println(method(10));

	}

}
