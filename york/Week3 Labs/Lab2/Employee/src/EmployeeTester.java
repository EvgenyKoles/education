
public class EmployeeTester
{
	public static void main(String[] args)
	{
		FullTimeEmployee fte = new FullTimeEmployee("A123", "Ms Full-Time", 25000);
		PartTimeEmployee pte = new PartTimeEmployee("B456", "Mr Part-Time",30);
	
		testMethod(fte); // call testMethod with a full-time employee object
		testMethod(pte); // call testMethod with a part-time employee object
		testMethod2(pte);

		System.out.println(fte.calculateMonthlyPay());

	}
	
	static void testMethod (Employee employeeIn) // the method expects to receive an Employee object
	{
	       System.out.println(employeeIn.getName());
	}

	static void testMethod2 (Employee a){

		System.out.println(a.getStatus());
	}
} 
