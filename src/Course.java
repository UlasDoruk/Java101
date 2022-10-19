
class Course {

	Teacher infos;
	String name;
	String branch;
	int code;
	
	
	Course(String name,String branch, int code){
		this.name = name ;
		this.branch = branch;
		this.code = code;
	}
	
	void addTeacher(Teacher infos) {
		if(infos.branch == this.branch) {
			System.out.println(infos.name + " can give the lesson.");
		}else {
			System.out.println(infos.name + " not match the course.");
		}
	}
	
	void printTeacher() {
		if(infos != null) {
			System.out.println(this.name + "gives from -> " + infos.name);
		}else {
			System.out.println(this.name + " is empty.");
		}
	}
	
}
