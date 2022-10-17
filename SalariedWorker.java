package p1;

import java.util.Scanner;

public class SalariedWorker extends Worker {

	
	
	int salary;
	SalariedWorker(int id,String n,int s)
	{
	super(id,n);
	salary=s;
	}
	
	




	@Override
	double computePay(int hours) {
		// TODO Auto-generated method stub
		display();
		
		
		System.out.println("Salary : "+salary*hours);
		
		return 0;
	}
	}







	
	
	

