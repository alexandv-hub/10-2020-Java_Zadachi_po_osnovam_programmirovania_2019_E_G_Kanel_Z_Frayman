package chapter12;

import java.util.Scanner;

public class Task_12_19 {
	/*
	 * Напишите класс, который принимает с клавиатуры следующие данные: 
• центр окружности (два действительных числа); 
• радиус окружности; 
• 15 пар координат точек на плоскости. 
Класс должен вывести на экран количество точек, лежащих внутри ок­
ружности и количество точек, лежащих на окружности.
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int centerX, centerY, R, pCoordX, pCoordY;
		int countInside = 0;
		int countOnCircle = 0;

		System.out.println("Введите координату X центра окружности");
		centerX = sc.nextInt();
		System.out.println("Введите координату Y центра окружности");
		centerY = sc.nextInt();

		System.out.println("Введите радиус окружности");
		R = sc.nextInt();
		

		for (int i=1; i<=15; i++) {
			System.out.println("Введите координату X точки № " + i);
			pCoordX = sc.nextInt();
			System.out.println("Введите координату Y точки № " + i);
			pCoordY = sc.nextInt();
			
			// найти расстояние между точкой и центром окружности. Если оно окажется меньше радиуса окружности R, 
			// то точка внутри, если больше R, то вне, а если равна R, то на окружности.
			// расчет расстояния : R = Math.sqrt( (x-a)^2+(x-b)^2 ), где x и y - координаты точки окружности, a и b - координаты центра окружности, R - радиус.
			boolean pInside = ( Math.sqrt(Math.pow( (pCoordX-centerX), 2) + Math.pow((pCoordY-centerY), 2) ) < R ) ;
			if (pInside) { 			
				countInside++;
			}
			
			// уравнение окружности: (x-a)^2+(x-b)^2=R^2, где x и y - координаты точки окружности, a и b - координаты центра окружности, R - радиус.  
			boolean pOnCircle = ( ( Math.pow((pCoordX-centerX), 2) + Math.pow((pCoordY-centerY), 2) ) == Math.pow(R, 2) ) ;
			if (pOnCircle) {
				countOnCircle++;
			}

		}
		System.out.println("количество точек, лежащих внутри окружности - " + countInside);
		System.out.println("количество точек, лежащих на окружности - " + countOnCircle);

	}

}
