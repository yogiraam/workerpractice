package p1;

public class MainWorker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HourlyWorker h=new HourlyWorker(67553,"Krish",15);
		SalariedWorker s=new SalariedWorker(986564,"krithik",100);
		h.computePay(44);
		s.computePay(40);
		}

	}

