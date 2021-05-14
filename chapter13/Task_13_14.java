package chapter13;

public class Task_13_14 {
	/*
	 * Школа организовала распродажу в пользу стариков. На распродаже 
продавались билеты двух видов: 
• обычный билет участника распродажи; 
• билет с правом посещения концерта. 

Тот, кто приобрел более 10 обычных билетов участника, получал до­
полнительно еще один такой же - бесплатно. 
Напишите класс, который для каждого из 200 участников распродажи 
будет принимать в качестве ввода количество билетов каждого вида, 
приобретенных данным участником (два положительных целых числа). 
Класс подсчитает и напечатает в качестве вывода число проданных биле­
тов каждого вида, а также число обычных билетов, выданных бесплатно. 
	 */

	public static void main(String[] args) {

		int numOfStandardTickets=0;
		int numOfVipTickets=0; 
		int numOfStandardTicketsSold = 0;
		int numOfStandardTicketsFree = 0;
		int numOfVipTicketsTotal = 0;


		for (int i=1; i<=200; i++) {

			numOfStandardTickets = 1 + (int) ( Math.random()*(11-1+1) ); {
				System.out.println("Ученик № " + i +" купил " + numOfStandardTickets + " обычных билетов" );
				numOfStandardTicketsSold += numOfStandardTickets;
			}

			if (numOfStandardTickets>10) {
				numOfStandardTicketsFree++;
				System.out.println("Ученик № " + i + " также получил 1 бесплатный билет" );
			}

			numOfVipTickets = 1 + (int) ( Math.random()*(11-1+1) ); {
				System.out.println("Ученик № " + i + " купил " + numOfVipTickets + " VIP билетов" );
				numOfVipTicketsTotal += numOfVipTickets; 
			}
		}

		System.out.println("Число проданных обычных билетов  = " + numOfStandardTicketsSold );
		System.out.println("Число проданных VIP билетов (с правом посещения концерта)  = " + numOfVipTicketsTotal);
		System.out.println("Число обычных билетов, выданных бесплатно = " + numOfStandardTicketsFree);
	}


}


