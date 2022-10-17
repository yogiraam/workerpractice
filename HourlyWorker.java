package p1;

import java.util.Scanner;

public class HourlyWorker extends Worker {
	
		int	excess=0;
    double newSalary=0.0;
	  
	int salary;
	HourlyWorker(int id,String n,int s)
	{
	super(id,n);
	salary=s;
	}
	 
	
		
		

	@Override
	double computePay(int hours) {
		// TODO Auto-generated method stub
		display();
		newSalary=(salary*hours)*7;
		if(hours<=40)
		{
		System.out.println("Salary of the worker :- "+salary*hours);
		}
		else if(hours>40)
			{
			   
			     
			     excess=hours-40;
				double hexcess =(hours-excess)*salary;//normal salary
			    
	            double newSalary = (salary*excess)*1.5;//overtime salary
	            double totalExcessSalary=(hexcess+ newSalary);//total by means normal+excess
	            System.out.println("Overtime Salary  : "+totalExcessSalary);
	            //Time and half means extra payment the worker working overtime
	            //The rate for overtime work is 1.5x a worker’s hourly rate
			} 
		
		return newSalary;
	
		
	}
	}

