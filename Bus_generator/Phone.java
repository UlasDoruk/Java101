import java.util.*;

public class Phone {
	
	private String countryCode,number,type,code;
	
	// Bütün parametreleri alıp constructur'da Phone class'ına geçiyoruz.
	
	Phone(String code,String number,String type){
		this.code = code;
		this.number = number;
		this.type = type;
		this.countryCode = "+90";
	}
	
	public  String getCountryCode() {
		return countryCode;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCOde(String code) {
		this.code = code;
	}
	
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void Display() {
		System.out.println("Phone number   : " + getCountryCode() +" " +getCode()+getNumber() );
		System.out.println("Type           : " + getType());
		
	}
}

