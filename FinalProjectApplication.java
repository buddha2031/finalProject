package com.zorba.finalProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
		Scanner scanner=new Scanner(System.in);
		BusinessService businessService=new BusinessService();

		System.out.println("Enter the  Customer Name:  ");
		String custName=scanner.next();
		boolean flag;
		if(businessService.validationName(custName)){
			System.out.println("Name is valid");
		};
System.out.println("Enter Mobile Number: ");
int custMob=scanner.nextInt();
String custMobString=Integer.toString(custMob);
if(businessService.validationMobilenumber(custMobString)){
	System.out.println("Mob Number is Valid");
}

	}

}
