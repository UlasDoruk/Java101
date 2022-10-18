
public class Student {
	
	String name;
	int stdNo;
	String classes;
	double average;
	boolean isPass;
	
	Student(String name,int stdNo,String classes ){
		this.name = name;
		this.stdNo = stdNo;
		this.classes = classes;
	}
		
	void isPass() {
		if(average >60) {
			System.out.println(this.name + " passed the " + this.classes);
		}else {
			System.out.println(this.name + " cant passed the " + this.classes);
		}
	}
	
	double calcAverage(int x,int y,int z) {
		this.average = (x*0.20)+(y*0.20)+(z*0.60);
		return average;
	}
	
//	void printNote() {
//		
//	}
	

}
