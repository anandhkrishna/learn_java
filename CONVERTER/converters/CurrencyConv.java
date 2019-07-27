package converters;

import java.util.Scanner;

public class CurrencyConv{
	public static double EuroToInr(double Euro){
		return Euro * 80;
	}
	
	public static double DollarToInr(double Dollar){
		return Dollar * 66.89;
	}
	
	public static double YenToInr(double Yen){
		return Yen * 0.61;
	}
	
	public static double InrToEuro(double Inr){
		return Inr * 0.013;
	}
	
	public static double InrToDollar(double Inr){
		return Inr * 0.015;
	}
	
	public static double InrToYen(double Inr){
		return Inr * 1.63;
	}
	
	public static void userChoice(){
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		double money = 0;
		
		System.out.println("\nCurrency Converter");
		System.out.println("******************");
		System.out.println("1.EURO   to INR");
		System.out.println("2.DOLLAR to INR");
		System.out.println("3.YEN    to INR");
		System.out.println("4.INR to EURO");
		System.out.println("5.INR to DOLLAR");
		System.out.println("6.INR to YEN");
		System.out.println("7.Exit\n");
		
		choice=scanner.nextInt();
		
		switch(choice){
			case 1:System.out.println("\nEnter in EURO...");
					money = scanner.nextDouble();
					System.out.println(money+ " EURO = "+CurrencyConv.EuroToInr(money)+" INR" );break;
			case 2:System.out.println("\nEnter in DOLLAR");
					money = scanner.nextDouble();
					System.out.println(money+ " DOLLAR = "+CurrencyConv.DollarToInr(money)+" INR");break;
			case 3:System.out.println("\nEnter in YEN");
					money = scanner.nextDouble();
					System.out.println(money+ " YEN = "+CurrencyConv.YenToInr(money)+" INR");break;
			case 4:System.out.println("\nEnter in INR");
					money = scanner.nextDouble();
					System.out.println(money+ " INR = "+CurrencyConv.InrToEuro(money)+" EURO");break;
			case 5:System.out.println("\nEnter in INR");
					money = scanner.nextDouble();
					System.out.println(money+ " INR = "+CurrencyConv.InrToDollar(money)+" DOLLAR");break;
			case 6:System.out.println("\nEnter in INR");
					money = scanner.nextDouble();
					System.out.println(money+ " INR = "+CurrencyConv.InrToYen(money)+" YEN");break;
			case 7:break;
			default:
					System.out.println("Invalid Choice..");break;
		}
	}
}