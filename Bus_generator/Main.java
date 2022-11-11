import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		Bus bus = new Bus("06 HUBM 06",42);
		
		// Ana menü'nün gösterimi
		boolean exit = false;
		
		do{
			System.out.println("1. Book a seat");
			System.out.println("2. Cancel booking");
			System.out.println("3. Print all passengers");
			System.out.println("4. Print available seats");
			System.out.println("5. Print all seats");
			System.out.println("6. Search passenger");
			System.out.println("7. Exit ");
			
			// Kullanıcı küçük bir if durumu ile verilen menü'den dışarı çıkamıyor.
			
			int menuNumber = input.nextInt();
			if(menuNumber >7 || menuNumber <=0) {
				
				System.out.println("Invalid number, enter proper number !! \n");
				
			}else if(menuNumber == 1) {
				// Kullanıcı bookSeat'i seçtiğinde gerekli parametreleri istiyoruz.
				System.out.print("Please enter your phone code and number : ");
				String phoneNumber = input.nextLine();
				String phoneCode = input.nextLine();
				
				// Kullanıcı geçersiz phone number giremiyor.
				
				if(phoneNumber.length() + phoneCode.length() != 10) {
					System.out.print("\n--- Invalid phone number ---\n");
				}
					System.out.print("Please enter your phone type   : ");
					String phoneType = input.nextLine();
					Phone phone = new Phone(phoneCode,phoneNumber,phoneType);
					System.out.print("Please enter your name         : ");
					String name = input.nextLine();
					System.out.print("Please enter your surname      : ");
					String surname = input.nextLine();
					System.out.print("Please enter your gender       : ");
					String gender = input.nextLine();
					Passenger passenger = new Passenger(name,surname,gender,phone);
				System.out.print("Please enter seatID : ");
				int seatID = input.nextInt();
				bus.bookSeat(passenger,seatID);
				
				
				// Her bir işlem için Bus sınıfındaki metodları çağırıyoruz.
				
			}else if(menuNumber == 2) {
				
				bus.cancelSeat();
				
			}else if(menuNumber == 3) {
				
				bus.printAllPassengers();
				
			}else if(menuNumber == 4) {
				
				bus.printAvaibleSeatIDs();
				
			}else if(menuNumber == 5) {
				
				bus.printAllSeats();
				
			}else if(menuNumber == 6) {
				
				bus.search();
			}
			else {
				exit = true;
			}
			
		}while(!exit);
		
	
	}

}
