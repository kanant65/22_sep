package com.inheritence_interface.bll;

public class TestEmployee {
	public static void main(String args[])
	{
		SalaryEmployee salariedEmployee =new SalaryEmployee("Kalin Bhaiya", "Chairman",250000);
		
		HourlyEmployee hourlyEmployee=new HourlyEmployee("Guddu Bhaiya","Right Hand",420,25);
		
		System.out.println(salariedEmployee);
		System.out.println(hourlyEmployee);
	}

}
