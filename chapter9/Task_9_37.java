package chapter9;

import java.util.Scanner;

public class Task_9_37 {
	/*
	 * Напишите класс, который принимает с клавиатуры имя и фамилию 
одного человека, а затем имя и фамилию другого. 
Класс должен проверить, являются ли эти два человека: 
• тезками, но не однофамильцами; 
• однофамильцами, но не тезками; 
• и тезками, и однофамильцами. 
По результатам проверки следует вывести на экран соответствующее 
сообщение. 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Введите имя и фамилию одного человека");
		String a = sc.nextLine();
		
		String[] aSplit = a.split(" ");
	    String aName = aSplit[0];
	    String aSurname = aSplit[1];
		System.out.println("aName = " + aName);
		System.out.println("aSurname = " + aSurname);
		
		System.out.println("Введите имя и фамилию другого человека");
	    String b = sc.nextLine();
		
		String[] bSplit = b.split(" ");
	    String bName = bSplit[0];
	    String bSurname = bSplit[1];
		System.out.println("bName = " + bName);
		System.out.println("bSurname = " + bSurname);
	    
	    if ( (aName.equals(bName)) & (!aSurname.equals(bSurname)) )
    	System.out.println("Эти 2 человека являются и тезками, но не однофамильцами");  
	    if ( (aName.equals(bName)) & (aSurname.equals(bSurname)) )
	    	System.out.println("Эти 2 человека являются и тезками, и однофамильцами");
	    if ( (aSurname.equals(bSurname)) & (!aName.equals(bName)) )
	    	System.out.println("Эти 2 человека являются однофамильцами, но не тезками");


	}

}
