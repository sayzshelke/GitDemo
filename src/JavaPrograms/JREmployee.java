package JavaPrograms;

public abstract class JREmployee implements Employee   {
	
	static int Bonus = 2000;
	
	public void jrEmployeeSalary()
	{ int initialSalary = 5000;
	 int total = 5000 + Bonus;
		System.out.println(total);
			
	}
	
	public void srEmployeeSalary()
	{ int initialSalary = 7000;
	 int total = 7000 + Bonus;
		System.out.println(total);
	}

	public void managerSalary()
	{ int initialSalary = 10000;
	 int total = 10000 + Bonus;
		System.out.println(total);
	}

	public void assistantSalary()
	{ int initialSalary = 2000;
	 int total = 2000 + Bonus;
		System.out.println(total);	
	}
	
}

