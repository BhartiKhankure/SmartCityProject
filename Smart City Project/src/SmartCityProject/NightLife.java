package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NightLife {
	String name;
	String address;
	String url;
	String contact_no;
	String email;

	public NightLife() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NightLife(String name, String address, String url, String contact_no, String email) {
		super();
		this.name = name;
		this.address = address;
		this.url = url;
		this.contact_no = contact_no;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "NightLife [name=" + name + ", address=" + address + ", url=" + url + ", contact_no=" + contact_no
				+ ", email=" + email + "]";
	}

	void nightlifeList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                         --------------------List of the Night Spots--------------------");
		list.add(
				"                                                                                                1) 10 Downing Street");
		list.add(
				"                                                                                                2) Longitude");
		list.add(
				"                                                                                                3) The Atmosphere");
		list.add(
				"                                                                                                4) Spot Of Restro");
		list.add(
				"                                                                                                5) Rhythm And Blues");
		list.add(
				"                                                                                                6) Fionua Lounge");
		list.add(
				"                                                                                                7) Hibiscus");
		list.add(
				"                                                                                                8) House Of Beer");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

	void addNightLifeDetails() {
		ArrayList<NightLife> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                         -----------------------------------------------------------------------");
		System.out.println(
				"                                                                              Enter the number of Night Spots where you want to visit First:");
		System.out.println(
				"                                                                         -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                          --------------------Welcome To The 10 Downing Street--------------------");
			list.add(new NightLife("10 Downing Street", "5th Floor, Milestone Building, Wardha Road, Nagpur",
					"http://10ds.in/nagpur/", "9370209500", "nagpur@10ds.in"));

			break;

		case 2:
			System.out.println(
					"                                                                          --------------------Welcome To The Longitude--------------------");
			list.add(new NightLife("Longitude", "Le Meridien Opposite Mihan Flyover, Wardha Road, Nagpur",
					"https://www.zomato.com/nagpur/longitude-le-meridien-wardha-road", "7103663333",
					"nagpur@14lemeridienlangitude.in"));
			break;

		case 3:
			System.out.println(
					"                                                                          --------------------Welcome To The The Atmosphere--------------------");
			list.add(new NightLife("The Atmosphere", "Vayusena Nagar, Nagpur",
					"https://www.zomato.com/nagpur/the-atmosphere-highway-hangout-vayusena-nagar", "7887446220",
					"nagpur@atmosphere.com"));
			break;

		case 4:
			System.out.println(
					"                                                                         --------------------Welcome To The Spot Of Restro--------------------");
			list.add(new NightLife("Spot Of Restro", "Gokulpeth Nagar- 440010, Opposite Venus Book Depot",
					"spot9restroloungebar.justdial.com", "9370000080", "spotofRestro@gamil.com"));
			break;

		case 5:
			System.out.println(
					"                                                                         --------------------Welcome To The Rhythm And Blues--------------------");
			list.add(new NightLife("Rhythm And Blues",
					"C/O Tuli International Hotel, Residency Road, Sadar Bazar, Nagpur- 440001", "www.tuligroup.com",
					"071226653555", "nagpur@tuligroup.com"));
			break;

		case 6:
			System.out.println(
					"                                                                         --------------------Welcome To The Fionua Lounge--------------------");
			list.add(new NightLife("Fionua Lounge",
					"Dharampeth Towers 209 West High Court Road, Square, Shankar Nagar, Dharampeth, Nagpur, Maharashtra- 440010",
					"http://fionua.lounge.in/nagpur/", "9372520666", "nagpur@fionua.lounge.in"));
			break;

		case 7:
			System.out.println(
					"                                                                         --------------------Welcome To The Hibiscus--------------------");
			list.add(new NightLife("Hibiscus",
					"1st Gupta House IDBI Bank, 1, Rabindranath Tagore Marg, Civil Lines, Nagpur, Maharashtra- 440001",
					"http://hibiscus/nagpur/", "9028030216", "nagpur@hibiscus.com"));
			break;

		case 8:
			System.out.println(
					"                                                                         --------------------Welcome To The House Of Beer--------------------");
			list.add(new NightLife("House Of Beer", "Collectors Colony, Civil Lines, Nagpur, Maharashtra- 440001",
					"http://houseofbeer.in/nagpur/", "9632587412", "nagpur@houseofbeer.in"));
			break;

		default:
			System.out.println(
					"                                                                          No Night Spots are Available !! Please choose the number from 1-8 !!");
		}

		Iterator<NightLife> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
