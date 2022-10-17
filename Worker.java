package p1;

public  abstract class Worker {
  String name;
  
  
	int empid;
	public Worker(int id,String n)
	{ 
		empid=id;
		name=n;
		}
	
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, int empno) {
		super();
		this.name = name;
		this.empid = empid;
	}

	 public void display()
	{
	System.out.println("\n--------------------------");
	System.out.println("Employee id : "+empid);
	System.out.println("Employee name : "+name);
	}
	 abstract double computePay(int hours);
	@Override
	public String toString() {
		return "Worker [name=" + name + ", empid=" + empid + "]";
	}

}