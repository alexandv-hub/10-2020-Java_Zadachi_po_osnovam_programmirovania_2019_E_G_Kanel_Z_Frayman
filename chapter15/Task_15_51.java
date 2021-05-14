package chapter15;

import java.util.Scanner;

public class Task_15_51 {
	/*
	 * Банк готов предоставить клиенту право производить операции на бан­
ковском счете при условии, что банковский овердрафт ("минус", отри­
цательная сумма на счету) не превысит определенной суммы. 

Напишите класс, который принимает с клавиатуры два значения: пер­
вое - величина допустимого овердрафта, второе - сумма на счету 
клиента в данный момент. 
Затем класс должен принять с клавиатуры серию чисел, каждое из ко­
торых - размер операции в рублях, которую клиент выполняет на своем 
банковском счете. Положительное значение - клиент вносит деньги на 
счет, отрицательное значение - клиент снимает деньги со счета. 
Ввод данных завершается либо при превышении клиентом разрешен­
ного овердрафта, либо при введении нулевого значения. 
Класс должен после каждой операции указывать сумму на счете клиента, 
а также количество операций вложения и количество операций снятия, 
произведенных клиентом. 
	 */
public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int overdraft, accBalance, operation, numIncrease=0, numDecrease=0; 
		
		System.out.println("Введите значение овердрафта");
		overdraft = - ( sc.nextInt()) ;
		System.out.println("Введите значение суммы на счету");
		accBalance = sc.nextInt();
		
		while (accBalance >= overdraft) {
			operation = -999 + (int) ( Math.random()*(999+999+1) );
			System.out.println("\n" + operation);
			accBalance += operation;
			
			if (operation < 0 ) {
				numDecrease++;
				System.out.println("Сумма снятия со счета = " + operation + ". Остаток = " + accBalance);
			}
			
			if (operation > 0 ) {
				numIncrease++;
				System.out.println("Сумма пополнения счета = " + operation + ". Остаток = " + accBalance);
			}
						
			if (operation == 0 )
				break;		
			
			System.out.println("Кол-во операций снятия - " + numDecrease);
			System.out.println("Кол-во операций пополнения - " + numIncrease);
			
		}
		
	}

}
