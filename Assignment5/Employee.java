package Assignment5;

public class Employee {
	int empId;
	String empName;
	String empDept;
	double empBasicSalary;
	double empGrossSalary;

	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
		calculateGrossSalary();
	}

	
	public boolean equals(Object obj) {
		Employee e = (Employee) obj; // downcast
		if (this.empId == e.empId && this.empName == e.empName)
			return true;
		return false;

	}
	//Problem 1
	
	public static void sortEmployee(Employee e[]) {
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(e[i].empBasicSalary>e[j].empBasicSalary)
				{
					Employee temp=e[i];
					e[i]=e[j];
					e[j]=temp;
				}
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(e[i].empId+" "+e[i].empName+ " "+" "+e[i].empDept+ " "+e[i].empBasicSalary+" "+e[i].empGrossSalary);
		}
	}
	
	public static void searchEmployees(Employee[] e,String dept)
	{
		System.out.println("/nEMployees with "+dept+" is /n");
		for(int i=0;i<5;i++)
		{
			if(e[i].empDept==dept)
			{
				System.out.println(e[i].empId+" "+e[i].empName+ " "+" "+e[i].empDept+ " "+e[i].empBasicSalary+" "+e[i].empGrossSalary);
			}
		}
	}
	
	
	//Problem 2
	public double calculateGrossSalary() {
		double DA = this.empBasicSalary * 12 / 100;
		double HRA = this.empBasicSalary * 8 / 100;
		this.empGrossSalary = this.empBasicSalary + DA + HRA;
		return this.empGrossSalary;
	}


	public static void main(String[] args) {
		Employee[] employee = new Employee[5];
		employee[0] = new Employee(1, "Deepak", "IT", 200000);
		employee[1] = new Employee(2, "SK jaid", "EC", 150000);
		employee[2] = new Employee(3, "Sai Naga", "IT", 180000);
		employee[3] = new Employee(4, "Shivam", "EC", 140000);
		employee[4] = new Employee(5, "Mohit", "IT", 300000);

		sortEmployee(employee);
		searchEmployees(employee,"IT");
	}

}
