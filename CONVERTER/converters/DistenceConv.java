package converters;

import java.util.Scanner;

public class DistanceConv{
	public static double MeterToKilometer(double Meter){
		return Meter /1000;
	}
	
	public static double MilesToKilometer(double Miles){
		return Miles * 1.60934;
	}
	
	public static double KilometerToMeter(double Km){
		return Km * 1000;
	}
	
	public static double KilometerToMiles(double Km){
		return Km /1.60934;
	}
	
	
	public static void userChoice(){
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		double distance = 0;
		
		System.out.println("Distance Converter");
		System.out.println("******************");
		System.out.println("1.Meter to Kilometer");
		System.out.println("2.Miles to Kilometer");
		System.out.println("3.Kilometer to Meter");
		System.out.println("4.Kilometer to Miles");
		System.out.println("5.Exit");
		
		choice=scanner.nextInt();
		
		switch(choice){
			case 1:System.out.println("\nEnter in Meters...");
					distance = scanner.nextDouble();
					System.out.println(distance+ " M = "+DistanceConv.MeterToKilometer(distance)+" KM" );break;
			case 2:System.out.println("\nEnter in Miles");
					distance = scanner.nextDouble();
					System.out.println(distance+ " Miles = "+DistanceConv.MilesToKilometer(distance)+" KM");break;
			case 3:System.out.println("\nEnter in Kilometer");
					distance = scanner.nextDouble();
					System.out.println(distance+ " KM = "+DistanceConv.KilometerToMeter(distance)+" M");break;
			case 4:System.out.println("\nEnter in KM");
					distance = scanner.nextDouble();
					System.out.println(distance+ " KM = "+DistanceConv.KilometerToMiles(distance)+" Miles");break;
			case 5:break;
			default:
					System.out.println("\nInvalid Choice..");break;
		}
	}
}