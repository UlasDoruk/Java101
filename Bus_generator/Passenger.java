import java.util.Arrays;
import java.util.Scanner;

public class Passenger {
	

 	private  String name;
 	private String surname;
	private  String gender;
	Phone phone;
	
	// Phone classında olduğu gibi yine aynı şekilde parametreleri constructurda tanımlıyoruz.
	
	Passenger(String name,String surname,String gender, Phone phone){
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.phone = phone;
	}

	public  String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void  setSurmane(String surname) {
		this.surname = surname;
	}
	
	public  String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	 public void Display() {
		System.out.println("Passenger name : " + getName()+ " "+ getSurname());
		System.out.println("Gender         : " + getGender());
		phone.Display();
		
	}

}
