package chapter19;

public class Task_19_22 {
	/*
	 Напишите метод, который принимает два параметра: массив целых 
чисел М и еще одно целое число Х. Метод возвращает количество ячеек 
массива М, содержащих значение Х (число появлений Х в М).
	 */

	public static void fillArr (int []M) {
		for (int i=0; i<M.length; i++) {
			M[i] = (int)( (9+1)*Math.random() );
		}
	}

	public static void printArr (int []M) {
		for (int i=0; i<M.length; i++) {
			System.out.print(M[i] + " ");
		}
	}

	public static void getXCellsNumber (int []M, int X) {
		int count=0;
		for (int i = 0; i<M.length; i++) {
			if (M[i] == X) {
				count++;
			}
		}
		System.out.println("\ncount = " + count);
	}

	public static void main(String[] args) {
		int X = 8;
		int[]M;
		M = new int [10];
		fillArr(M);
		printArr(M);
		getXCellsNumber(M, X);
	}
}
