import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bus {

	static Scanner input = new Scanner(System.in);
	
	
	Phone ph1 = new Phone("531","7443501","cell");
	Phone ph2 = new Phone("531","7443502","cell");
	Phone ph3 = new Phone("531","7443503","cell");
	Phone ph4 = new Phone("531","7443504","cell");
	Phone ph5 = new Phone("531","7443505","cell");
	Phone ph6 = new Phone("531","7443506","cell");
	Phone ph7 = new Phone("531","7443507","home");
	Phone ph8 = new Phone("531","7443508","home");
	Phone ph9 = new Phone("531","7443509","home");
	Phone ph10 = new Phone("531","7443500","home");
	
	Passenger ps1 = new Passenger("Anakin","SKYWALKER","male",ph1);
	Passenger ps2 = new Passenger("Princess","LEIA","female",ph2);
	Passenger ps3 = new Passenger ("Obi","WAN","male",ph3);
	Passenger ps4 = new Passenger ("Padme","AMIDALA","female",ph4);
	Passenger ps5 = new Passenger ("Kit","Fisto","male",ph5);
	Passenger ps6 = new Passenger ("Ahsoka","TANO","female",ph6);
	Passenger ps7 = new Passenger ("Mace","WINDU","male",ph7);
	Passenger ps8 = new Passenger ("Bo","KATAN","female",ph8);
	Passenger ps9 = new Passenger ("Din","DJARIN","male",ph9);
	Passenger ps10 = new Passenger ("Mon","MOTHMA","female",ph10);
	
	Seat s1 = new Seat(1,true,ps1);
	Seat s2 = new Seat(2,true,ps2);
	Seat s3 = new Seat (3,true,ps3);
	Seat s4 = new Seat (4,true,ps4);
	Seat s5 = new Seat (5,true,ps5);
	Seat s6 = new Seat (7,true,ps6);
	Seat s7 = new Seat (9,true,ps7);
	Seat s8 = new Seat (11,true,ps8);
	Seat s9 = new Seat (12,true,ps9);
	Seat s10 = new Seat(15,true,ps10);
	
	
	String plaka;
	private  int numberOfSeats;
	 Seat [] seats;
//	ArrayList<Seat> seats = new ArrayList<Seat>();
	
//	Burada seats objelerinden oluşan bir array oluşturuyoruz.
 			
	Bus(String plaka,int numberOfSeats){
		this.plaka = plaka;
		this.numberOfSeats = numberOfSeats;
		seats = new Seat[numberOfSeats];
		
		// Arrayler sıfırıncı indexten başladığı için gelen koltuk numarasının bir eksiğine yerleştiriyoruz.
		seats [s1.getSeatID()-1] = s1;
		seats [s2.getSeatID()-1] = s2;
		seats [s3.getSeatID()-1] = s3;
		seats [s4.getSeatID()-1] = s4;
		seats [s5.getSeatID()-1] = s5;
		seats [s6.getSeatID()-1] = s6;
		seats [s7.getSeatID()-1] = s7;
		seats [s8.getSeatID()-1] = s8;
		seats [s9.getSeatID()-1] = s9;
		seats [s10.getSeatID()-1] = s10;
		
	}
	
	public  int getNumberOfSeats() {
		return numberOfSeats;
	}

	public  void bookSeat(Passenger p, int seatID) {
		// Burada kullanıcının girdiği bilgilerle yeni bir Seat objesi oluşturup, eğer girilen koltuk numarası boş ise o index'e yerleştiriyoruz.
		// Eğer girilen koltuk index'i boş değilse koltukta kimin oturduğu gösteriliyor.
			for(int i =0;i<seats.length;i++) {
				if(seats[seatID-1] == null) {
					seats[seatID-1] = new Seat(seatID,true,p);	
					System.out.println("\nYour booking process completed\n");
					System.out.println("Seat "+this.seats[seatID-1].getSeatID() + " -> " + this.seats[seatID-1].p.getName() + " " + this.seats[seatID-1].p.getSurname()+ "\n");
					break;
				}else {
					System.out.println("\nThis seat has been booked from " + this.seats[seatID-1].p.getName()+" "+this.seats[seatID-1].p.getSurname()+"\n");
					printAvaibleSeatIDs();
					System.out.println("");
					break;
				}
			}
	
	}
	
	public void cancelSeat() {
		// Bu fonksiyonda kullanıcan bir koltuk numarası alınıyor eğer koltuk dolu ise bilgilerini null ile değiştiriyoruz.
		// Ama bu değiştirme işlemini kalıcı olarak yapamadım. Yani kullanıcı printAllPassengers dediği zaman iptal edilen koltukda hala biri oturuyor gözüküyor.
		System.out.print("Please enter seat number : ");
		int cancelSeat = input.nextInt();
		for(int i =0;i<getNumberOfSeats();i++) {
			if(seats[i]!=null && seats[i].getSeatID() == cancelSeat) {
				System.out.println("Seat -> " + seats[i].getSeatID() + " has been cancelled. " + seats[i].p.getName() + " " + seats[i].p.getSurname() + "\n");
				this.seats[i] = null;
			}
		}
	}
	
	 public void printAllPassengers() {
		// Küçük bir for döngüsüyle passengerların bilgilerine ulaşıyoruz.
		 for(int i =0;i<getNumberOfSeats();i++) {
			 if (this.seats[i] != null) {
				this.seats[i].Display();
			 }
		 }
	}
	
	 public void printAvaibleSeatIDs(){
		 // Burada ise boş koltukları ekrana yazdırıyoruz.
		 for(int i  =0;i<getNumberOfSeats();i++) {
			 if(Bus.this.seats[i] == null) {
				 System.out.println("Available seatID -> " + (i+1));
			 }
		 }
	}
	 public void printAllSeats( ) {
		 // Üstteki 2 fonksiyonun birleşimi olarak bütün koltukların durumunu gösteriyoruz.
		 for(int i =0;i<getNumberOfSeats();i++) {
			 if(this.seats[i] == null) {
				 System.out.println("Seat " + (i+1) + "  -> Empty" );
			 }else {
				 System.out.println("Seat " + this.seats[i].getSeatID() +  "  -> " + this.seats[i].p.getName()+ " " + this.seats[i].p.getSurname());
			 }
		 }
	}
	
	public void search() {
		// Kullanıcıdan bir isim girmesi isteniyor, eğer bu isim seats array'inin içinde ise bu kişinin otobüsde bulunduğunu yok ise var olmadığını söylüyoruz.
		System.out.print("Please enter passenger's name : ");
		String passengerName = input.next();
		int numberOfPassenger = 0;
		boolean flag = false;
		for(int i =0;i<this.seats.length;i++) {
			if(this.seats[i] != null && this.seats[i].p.getName().contains(passengerName)) {
				flag = true;
				numberOfPassenger = i;
				break;
			}
		}
		
		if(flag == true){
			this.seats[numberOfPassenger].Display();
		}else {
			System.out.println("\nThere is no any passenger same name as -> " + passengerName + "\n");
		}
	}
	
}
