package chapter19;

public class Task_19_9 {
	/*
	 * Напишите метод, который получает в качестве параметра массив и 
заполняет его положительными случайными двузначными четными 
числами. 
	 */

	public static void fillArr (int []a) {
		
		int c = 0;
		
		for (int i=0; i<a.length; i++) {
			
			c = 10+(int)( (99-10+1)*Math.random() );
			
			if (c%2==0)
				a[i] = c;
			
			else { 
				
				if (c==99) {
					c -= 1;
					a[i] = c;
				}
				
				if (c!=99) {
					c += 1;
					a[i] = c;
				}
				
			}
		}
	}

	public static void printArr (int []a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int [] a;
		a = new int[10];
		fillArr(a);
		printArr(a);
	}

}