import java.util.Arrays;
import java.util.Scanner;

public class Seat {

	private int seatID;
	private  boolean status;
	Passenger p;
	
	// Bu sınıfa ekstra olarak Passengerden gelen objeleri p değişkenin içinde tutuyoruz.
	
	
	Seat(int seatID,boolean status, Passenger p){
		this.seatID = seatID;
		this.status = true;
		this.p = p;
	}

	public int getSeatID() {
		return seatID;
	}
	
	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}
	
	public  boolean getStatus() {
		return status;
	}
	
	public  void setStatus(boolean status) {
		this.status = status;
	}
	
	public  void Display() {
		System.out.println("---");
		System.out.println("SeatID         : " + getSeatID());
		p.Display();
		System.out.println(" ");
	}
	
}
