import java.util.*;
class Employee
{
	int e_no;
	String e_name;
	float e_salary;
	Employee(int id,String name,float sal)
	{
		e_no=id;
		e_name=name;
		e_salary=sal;
	}
} 
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		int id,i,flag=0;
		String name;
		float sal;
		System.out.println("Enter the no.of employees: ");
		int n=sc.nextInt();
		Employee[] obj=new Employee[n];
		for(i=0;i<n;i++)
		{
		System.out.println("Enter the details of employee: " + (i+1));
		System.out.println("Employee no: ");
		id=sc.nextInt();
		System.out.println("Employee name: ");
		name=s.nextLine();
		System.out.println("Employee salary: ");
		sal=sc.nextFloat();
		obj[i]=new Employee(id,name,sal);
	}
	System.out.println("Enter the employee id to be searched: ");
	int temp=sc.nextInt();
	for(i=0;i<n;i++)
	{
		if(obj[i].e_no==temp)
		{
			System.out.println("Result found!");
			flag=1;
			break;
		}
	} 
	if(flag==1)
		System.out.println("Employee name: "+ obj[i].e_name);
	else
		System.out.println("Not found" );
	}
}
