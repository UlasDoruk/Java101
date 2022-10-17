public class Note_System {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("t1","Math");
		
		// ----------------------
		
		Course math = new Course("Math","Math",001);
		math.addTeacher(t1);
		math.printTeacher();
		
		// ----------------------
		
		Student st1 = new Student("st1",12,"Math");
		st1.calcAverage(60,60,70);
		st1.isPass();
		
		
	}

}
