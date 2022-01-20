package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Attraction {
	String address;
	String description;

	public Attraction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attraction(String address, String description) {
		super();
		this.address = address;
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Attraction [address=" + address + ", description=" + description + "]";
	}

	void attractlist() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                     --------------------List Of Attractive places--------------------");
		list.add(
				"                                                                                            1) Ambazari Lake");
		list.add(
				"                                                                                            2) DeekshaBhoomi");
		list.add(
				"                                                                                            3) Maharaj Bagh Zoo");
		list.add(
				"                                                                                            4) Futala Lake");
		list.add(
				"                                                                                            5) Ramdham");
		list.add(
				"                                                                                            6) SwamiNarayan Mandir");
		list.add(
				"                                                                                            7) Tadoba National Park");
		list.add(
				"                                                                                            8) Dragon Palace");
		list.add(
				"                                                                                            9) Surabuldi Dam");
		list.add(
				"                                                                                            10) Japanese Garden");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

	void addAttraction() {
		ArrayList<Attraction> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		System.out.println(
				"                                                                         Enter the number of Attractive Spot where you wanr to visit First:");
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                                   --------------Welcome To Ambazari Lake--------------");
			list.add(new Attraction("Ambazari Lake, Nagpur, Maharashtra- 440033",
					"It's lovely place unfortunately it's neglect by the authorities otherwise could have been one of the best picnic spot. Let's hope that tourism department will look after soon. If you visit Nagpur , must visit this place."));
			break;

		case 2:
			System.out.println(
					"                                                                                   ---------------Welcome To DeekshaBhoomi---------------");
			list.add(new Attraction("Ramdaspeth, Nagpur 440022, India",
					"Deekshabhoomi is a sacred monument of Navayana Buddhism located where the architect of the Indian Constitution. B. R. Ambedkar, converted to Buddhism with approximately 600,000 followers on Ashok Vijaya Dashami on 14th October 1956. Ambedkar's conversion to Buddhism is deeply significant for millions of people in India."));
			break;

		case 3:
			System.out.println(
					"                                                                                   ---------------Welcome To Maharaj Bagh Zoo----------------");
			list.add(new Attraction("Gorepeth, Nagpur, Maharashtra- 440012 ",
					"Maharaj Bagh Zoo is the central Zoo of Nagpur, India. The Zoo is located in the heart of the city and has been built on the garden of the Bhosale and Maratha Rulers of the city. The Zoo comes under the central Zoo Authority[CZA] of India and is maintained by the Panjabrao Deshmukh Krushi Vidyapeeth(PKV) of Nagpur. The Zoo had come under scrutiny in 2006 for possible closure due to issues concerning animal healthcare but was cleaned of all objections raised by CZA in 2007."));
			break;

		case 4:
			System.out.println(
					"                                                                                   ----------------Welcome To Futala Lake------------------");
			list.add(new Attraction("Chowpati Rd, Juna Futala, Vayusena Nagar, Nagpur, Maharashtra- 440013",
					"Futala Lake is one of the lake in Nagpur in the Indian State of Maharashtra. The lake is spread over 60 acres. Build by Bhosale kings of Nagpur, the lake is known for its coloured fountains. In the evening the place is illuminated with halogen lights and Tanga ride."));
			break;

		case 5:
			System.out.println(
					"                                                                                   ----------------Welcome To Ramdham-------------------");
			list.add(new Attraction("Nagpur Jabalpur Road, Mansar, Maharashtra- 440010",
					"Its amazing attraction around Nagpur while going to pench or Ramtek. Its developed by a nature lover and ecofriendly environmental activist and also a divine and religeous social worker Mr. Chandrapal Choukse. A must visit place in the evening hours when kids can enjoy folk dances and nagic show. The OM has been included in Limka book or records. The caves, all Gods and Goddesses, the peaseful surrounding and suroundinf greenery makes one well satisfied and gives peace of mind. Must visit."));
			break;

		case 6:
			System.out.println(
					"                                                                                   -----------------Welcome To SwamiNarayan Mandir-----------------");
			list.add(new Attraction("Swaninarayan Marg Middle Ring Road, Wathoda Nagpur",
					"Swaminarayan, Te founder of the Swaminarayan Sampraday, established temples, known as Mandirs(Devnagri: SwamiNarayan Mandir), as part of his philosophy of theism and deity worship. These Mandirs are known as Swaminarayan Hindu Temples. He constructed nine temples in the following cities: Ahmedabad, Bhuj, Muli, Vadtal, Janagadh, Dholera, Dholka, Gadhpur and Jetalpur. In these temples he installed images of various Hindu Gods, such as NarNarayan Dev, LuxmiNarayan Dev, RadhaKrishna Dev, RadhaRaman Dev, Revti-Baldevji, Madan Mohan Dev etc. Each of these nine original temples fall either under the NarNarayan Dev Gadi, Ahmedabad or the LuxmiNarayan Dev Gadi, Vedtal depending on their Geographical location."));
			break;

		case 7:
			System.out.println(
					"                                                                                    -----------------Welcome To Tadoba National Park--------------------");
			list.add(new Attraction("Chandrapur, Maharashtra- 442401",
					"Tadoba Andheri Tiger Reserve is Located in Chandrapur District, Maharashtra State, India. It is Maharashtra's oldest and largest national park. Created in 1995, the area of the Reserve is 625.40 square kilometers(241.47 sq mi). This includes Tadoba National park, created in 1955 with an area of 116.55. square kilometers(45.00 sq mi) and Andheri WildLife sanctury created in 1986 with an are of 508.85 square kilometers(196.47 sq mi). The Reserve is constituted with 577.96 square kilometers(223.15 sq mi0 of reserve forest and 32.51 square kilometers(12.55sq mi)"));
			break;

		case 8:
			System.out.println(
					"                                                                                    -----------------Welcome To Dragon Palace------------------");
			list.add(new Attraction("Dadasaheb Kubhare Parisar, New Kamtee, Maharashtra- 441001",
					"The Dragon Palace Temple, also known as the Lotus Templeof Nagpur. It is a Budhhist temple in the Nagpur."));
			break;

		case 9:
			System.out.println(
					"                                                                                    -----------------Welcome To Surabuldi Dam------------------");
			list.add(new Attraction("Near Waddhamna Town, Nagpur",
					"Divine place to visit , not very far from the city yet a Treat to watch.There are Twelve Shivlings inside the cave which is created beautifully and artistically. There is a Nominam Entry Fee per person which I guess they would be utilizing to maintain the place. Must visit and Superb Effort to build the complete Architecture. Om Nahah Shivay!!"));
			break;

		case 10:
			System.out.println(
					"                                                                                    ------------------Welcome To Japanese Garden-------------------");
			list.add(new Attraction("Seminary Hills, Nagpur, MAharashtra- 440001",
					"Japanese Rose Garden Nagpur. The ideal place for amental and soulful relaxation is the Japanese Rose Garden which derived its name from the design and layout of the area. The Japanese Rose Garden is built in a way that the people in Japan grow roses or ant type of flowers and hence it is called as the Japanese Rose Garden. The scenic beauty leaves you in awe and is the perfect place to take beautiful pictures while truly admire nature's Beauty in India. The Garden is located in Nagpur city along the civil lines, a few miels away from the city."));
			break;

		default:
			System.out.println(
					"                                                                                     No Attractive Spots are Available !! Please choose the number from 1-10 !!");
		}

		Iterator<Attraction> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

}
