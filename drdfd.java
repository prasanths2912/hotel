package javaproject;

import java.util.Scanner;

public class drdfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String food ="";
		System.out.println("HOTEL");
		int expected =10;
		while(expected >0)
		{
			System.out.println("order the dish");
			food = scan.next();
			switch(food)
			{
			case "idly":case"dhosa":case"poori":System.out.println(food+" is ready to order");
			expected --;
			break;
			case "meals":System.out.println(food+"  is ready on afternon");
			expected--;
			break;
			default:System.out.println("is cooking "+food);
			}
			
		}
	}

}
