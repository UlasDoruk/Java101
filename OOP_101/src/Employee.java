
public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	int newSalary=0;
	
	Employee(String name, int salary, int workHours, int hireYear){
		this.name = name ;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
		 
		 public void bonus() {
			 if(this.workHours >= 40) {
				 this.newSalary +=  (this.workHours - 40 ) * 30 ;
				 System.out.println("Bonus -> " + (this.workHours - 40 ) * 30 );
			 }else {
				 System.out.println("Work hours of " + this.name + " not exceed the 40 hours" );
			 }
		 }
		 
		public void raiseSalary() {
			 if((2021 - this.hireYear) < 10 ) {
				 System.out.println("Salary Raise -> " + this.salary * 0.05);
				 this.newSalary += this.salary * 0.05;
			 }else if ((2021 - this.hireYear) >= 20) {
				 System.out.println("Salary Raise -> " + this.salary * 0.15);
				 this.newSalary += this.salary * 0.15;
			 }else if ((2021 - this.salary) > 9 && (2021 - this.salary) < 20 ) {
				System.out.println("Salary Raise -> " + this.salary * 0.10);
				this.newSalary += this.salary * 0.10; 
			 }
		 }
		
		public void tax(){
			if(this.salary <= 1000) {
				 System.out.println("No taxes");
			}
			System.out.println("Taxes -> " + this.salary * 0.03);
				this.newSalary -= this.salary * 0.03;
				this.salary += this.newSalary;
			}
			 
		public void run() {
			 System.out.println("Employee name -> " + this.name);
			 System.out.println("Salary -> " + this.salary);
			 System.out.println("Working hours -> " + this.workHours);
			 System.out.println("Hiring Year -> " + this.hireYear);
			 bonus();
			 raiseSalary();
			 tax();
			 System.out.println("Total Salary -> " + ( this.salary));
		 }
		
	}
	

