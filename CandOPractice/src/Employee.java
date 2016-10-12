
public class Employee {
	public String name;
	public double salary;
	
	public Employee(String n, double s){
		name = n;
		salary = s;
	}
	
	public String getName(String na){
		name = na;
		return na;
	}
	
	public double getSalary(double sal){
		salary = sal;
		return sal;
	}
	
	public void raiseSalary(double byPercent){
		byPercent = byPercent / 100;
		double newSal = (salary * byPercent) + salary;
		System.out.println(newSal);
	}
}
