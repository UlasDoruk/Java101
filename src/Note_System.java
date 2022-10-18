public class Note_System {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("t1","Math");
		Teacher t2 = new Teacher("t2","Phy");
		Teacher t3 = new Teacher("t3","Phy");
		
		// ----------------------
		
		Course math = new Course("Math","Math",001);
		Course phy = new Course ("Phy","Phy",002);
		math.addTeacher(t1);
		math.printTeacher();
		
		phy.addTeacher(t2);
		phy.addTeacher(t3);
		// ----------------------
		
		Student st1 = new Student("st1",12,"Math");
		st1.calcAverage(60,60,70);
		st1.isPass();
		
		
	}

}
