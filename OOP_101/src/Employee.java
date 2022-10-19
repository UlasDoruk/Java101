
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	int newSalary=0;
	int currentYear = 2021;
	boolean flag = true;
	
	Employee(String name, double salary, int workHours, int hireYear){
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
		 
		 public boolean validYear() {
			 if(this.hireYear > this.currentYear || this.hireYear <1970 ) {
				 return flag = false;
			 }else {
				return flag;
			 }
		}
		 
		public void raiseSalary() {
			 if((this.currentYear - this.hireYear) < 10 ) {
				 System.out.println("Salary Raise -> " + this.salary * 0.05);
				 this.newSalary += this.salary * 0.05;
			 }else if ((this.currentYear - this.hireYear) >= 20) {
				 System.out.println("Salary Raise -> " + this.salary * 0.15);
				 this.newSalary += this.salary * 0.15;
			 }else if ((this.currentYear - this.hireYear) > 9 && (this.currentYear - this.hireYear) < 20 ) {
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
			if(validYear()) {
				 System.out.println("Employee name -> " + this.name);
				 System.out.println("Salary -> " + this.salary);
				 System.out.println("Working hours -> " + this.workHours);
				 System.out.println("Hiring Year -> " + this.hireYear);
				 bonus();
				 raiseSalary();
				 tax();
				 System.out.println("Total Salary -> " + ( this.salary));
			}else {

				 System.out.println("Please enter the valid hiring year !!");
			}
			 
		 }
		
	}
	

