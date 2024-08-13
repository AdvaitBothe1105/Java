class Employee
{
	String name,address;
	int year,salary;
	Employee(String name,String address,int year,int salary)
	{
		this.name=name;
		this.year=year;
		this.address=address;
		this.salary=salary;
	}
	void display_info()
	{
		System.out.println("Name\tAddress\tyear\tsalary");
		System.out.println(name+"\t"+address+"\t"+year+"\t"+salary);
		
	}
	public static void main(String args[])
	{
		Employee e=new Employee("Tejas","Kurla",2018,200000);
		Employee e1=new Employee("Manoj","Nerul",2013,300000);
		Employee e2=new Employee("Tejas","Mumbai C",2018,200000);
		
	}
}
