package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HotelManagement {
	String hotel_name;
	String hotel_address;
	String hotel_url;
	String hotel_contact_no;
	String hotel_email;
	String hotel_description;

	public HotelManagement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelManagement(String hotel_name, String hotel_address, String hotel_url, String hotel_contact_no,
			String hotel_email, String hotel_description) {
		super();
		this.hotel_name = hotel_name;
		this.hotel_address = hotel_address;
		this.hotel_url = hotel_url;
		this.hotel_contact_no = hotel_contact_no;
		this.hotel_email = hotel_email;
		this.hotel_description = hotel_description;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getHotel_address() {
		return hotel_address;
	}

	public void setHotel_address(String hotel_address) {
		this.hotel_address = hotel_address;
	}

	public String getHotel_url() {
		return hotel_url;
	}

	public void setHotel_url(String hotel_url) {
		this.hotel_url = hotel_url;
	}

	public String getHotel_contact_no() {
		return hotel_contact_no;
	}

	public void setHotel_contact_no(String hotel_contact_no) {
		this.hotel_contact_no = hotel_contact_no;
	}

	public String getHotel_email() {
		return hotel_email;
	}

	public void setHotel_email(String hotel_email) {
		this.hotel_email = hotel_email;
	}

	public String getHotel_description() {
		return hotel_description;
	}

	public void setHotel_description(String hotel_description) {
		this.hotel_description = hotel_description;
	}

	@Override
	public String toString() {
		return "HotelManagement [hotel_name=" + hotel_name + ", hotel_address=" + hotel_address + ", hotel_url="
				+ hotel_url + ", hotel_contact_no=" + hotel_contact_no + ", hotel_email=" + hotel_email
				+ ", hotel_description=" + hotel_description + "]";
	}

	HotelManagement hotelList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                         --------------------List of the Hotels--------------------");
		list.add(
				"                                                                                            1) Radisson Blu");
		list.add(
				"                                                                                            2) The Pride Hotel");
		list.add(
				"                                                                                            3) Le Meridien");
		list.add(
				"                                                                                            4) Dwarkamai");
		list.add(
				"                                                                                            5) Tuli International");
		list.add(
				"                                                                                            6) Hotel Airport Centre Point");
		list.add(
				"                                                                                            7) Ashoka");
		list.add(
				"                                                                                            8) Orange City Hotel");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		return null;
	}

	void addHotelDetails() {
		ArrayList<HotelManagement> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		System.out.println(
				"                                                                              Enter the number of hotel where you want to visit First:");
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                    --------------------Welcome To The Radisson Blu--------------------");
			list.add(new HotelManagement("Radisson Blu", "7 Wardha Road, Nagpur 440015, Maharashtra India",
					"https://www.radissonblu.com/en/hotel-nagpur", "18001080333", "res@rdnagpur.com",
					"Radisson Blu Hotel is located in Nagpur, only 10-minute drive away from nagpur International Airport. "
							+ "An outdoor pool lined with sun loungers, a well-equipped fitness center, and pampering spa treaatments are also provided."
							+ " Free Wi-Fi is available throughout the entire hotel. Complimentary shared 2-way airport transfers are provided. "
							+ "Featuring modern decor and carpeted flooring, all rooms come with a 42-inch flat screen TV, aa well-stocked mini-bar and a personal safe. "
							+ "Private bathrooms comes with a bathtub."));
			break;

		case 2:
			System.out.println(
					"                                                                     --------------------Welcome To The The Pride Hotel--------------------");
			list.add(new HotelManagement("The Pride Hotel",
					"The Pride Hotel,Opp.Airport Wardha Road,Nagpur, Maharashtra India-440025",
					"http://www.pridehotel.com/nagpur/the-pride-hotel-nagpur/overview/", "07126622555",
					"reservations.nagpur@pridehotel",
					"Located 3.7 m away from Deeksha Bhoomi and Nagpur Museum at Civil Lines, Pride Hotel offers air-conditioned rooms and a fitness room. "
							+ "Free airport transfers are provided. Pride Nagpur's rooms have a flat-screen TV, mini-bar and private bathrooms. Cookises and free bottoled water are offered. "
							+ "Guests can enjoy various massages ranging from Ayurvedic to Swedish. A steam room, jacuzzi and manicure facilities are available."));
			break;

		case 3:
			System.out.println(
					"                                                                     --------------------Welcome To The Le Meridien--------------------");
			list.add(new HotelManagement("Le Meridien",
					"Wardha Road, Flyover, Opp, MIHAN, Nagpur, Nagpur Maharashtra- 441108",
					"https://www.marriott.com/hotels/travel/nagmd-le-meridien-nagpur/", "7103663333",
					"tourandtravel@le-meridien.com",
					"Le Meridien Nagpur is 10-minutes drive away from Dr. Babasaheb Ambedkar International Airport and offers rooms with free WI-Fi. "
							+ "It has a 24-hour coffee shop and outdoor pool. Comlimentary 2-way Airport transfers is provided. "
							+ "Rooms at the Le Meridien Nagpur come equipped with a flat-screen cable TV, an electronic safe and tea/coffee maker. "
							+ "A fruit basket, cookies and bottled water are provided. Guests can exercise at the hotel's fitness room. "
							+ "A sauna , a spa bath and massage services offer relaxation. Free parking is available at Le Meridien Hotel."));
			break;

		case 4:
			System.out.println(
					"                                                                    --------------------Welcome To The Dwarkamai--------------------");
			list.add(new HotelManagement("Dwarkamai",
					"Near, Sri Sainath Enclave, St Stand rd, Ganeshpeth Colony, Nagpur, Maharashtra- 440018",
					"http://www.dwarkamaihotel.com", "07126693777", "rooms@dwarkamaihotel.com",
					"Featuring a terrace, Hotel Dwarkamai is located in Nagpur, 3.7 km from Vidarbh Cricket Association Stadium. "
							+ "The property is around 2.3 km from MaharajBagh Zoo. The hotel has a restaurant, and Sitabuldi Fort is 3.2 km away. "
							+ "At the hotel, every room includes a desk. Featuring a private bathroom, rooms at Hotel Dwarkamai also feature free Wi-Fi. "
							+ "All guest rooms have a flat-screen TV with satellite channels. DeekshaBhoomi is 4.8 km from the accomodation. "
							+ "Dr. Babasaheb Ambedkar International Airprt is 9.7 km from the hotel."));
			break;

		case 5:
			System.out.println(
					"                                                                      --------------------Welcome To The Tuli International--------------------");
			list.add(new HotelManagement("Tuli International",
					"5, Residency Rd, Next to Liberty Cinema, Sadar, Nagpur, MAharashtra-440001",
					"http://tulihotels.com", "07126653555", "sales@tuligroup.com",
					"Step in….the paradise of Nagpur, hotel Tuli International and you will surrounded by beauty and warmth right from the doorstep. "
							+ "It’s a name synonyms with avant-grade, quality and superior customer care services. The ambience of the place is bewitching and fabulous."
							+ "From the moment you book yourself in our hotel, we take care of everything for you to enjoy every moment of your richly deserved holiday and savour all that is on offer. "
							+ "We have a friendly and professional guest relation executives to cater "
							+ "to every individual requirment of our guests. So for an ultimate and intimate traveling experience you can always trust Tuli International."));
			break;

		case 6:
			System.out.println(
					"                                                                     --------------------Welcome To The Hotel Airport Centre Point--------------------");
			list.add(new HotelManagement("Hotel Airport Centre Point", "7 Wardha Road Nagpur 440015, Maharashtra India",
					"http://www.airportcentrepoint.com", "7122284049", "reservations@airportcentrepont.com",
					"Hotel Centre Point established in 1988, Is the pioneer int the Hospitality Industry since 25 years, recognized as one of the finest and prestigious address in the Orange City, Nagpur."
							+ " We have relaunched the Hotel to provide High End Luxury services to our guests. We houses 100 rooms which includes Executive rooms, Executive Deluxe rooms. "
							+ "Club Class rooms, Renaissance Suites and Deluxe Suites with top class amenities and highest level of hospitality."));
			break;

		case 7:
			System.out.println(
					"                                                                    --------------------Welcome To The Ashoka--------------------");
			list.add(new HotelManagement("Ashoka",
					"WHC Road, Aath Rasta Square, Luxmi Nagar, Nagpur, Maharashtra 440022",
					"https://thenagpurashok.com/", "8888870722", "booking@thenagpurashok.com",
					"I am very grateful for your note complimenting the services and food quality of our hotel. "
							+ "Positive feedback from our guests is always a strong motivation to all of us to of services to our guests."
							+ " It was indeed a pleasure having you at the Hotel Nagpur Ashok and we look forward to welcoming you soon again."));
			break;

		case 8:
			System.out.println(
					"                                                                    --------------------Welcome To The Orange City Hotel--------------------");
			list.add(new HotelManagement("Orange City Hotel",
					"Central Ave, Opp Gitanjali Theater, Lodhipura, Nagpur, Maharashtra 440018",
					"http://www.staymango.com", "07126683000", "reservations@staymango.com",
					"Located within the Mahajan Market, Hotel Orange City is just 0.6 mi from Nagpur Fort. "
							+ "It provides complimentary private parking spaces and free wired internet access in its public areas. "
							+ "Guests can make tour arrangements at the travel desk. "
							+ "The 24-hour reception staff can assist with laundry, ironing and other requests."));
			break;

		default:
			System.out.println(
					"                                                                     No Hotels are Available !! Please choose the number from 1-8 !!");
		}

		Iterator<HotelManagement> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
