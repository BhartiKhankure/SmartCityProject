package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Sport {
	String place_name;
	String sport_name;
	String address;
	String url;
	String contact_no;
	String email;

	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sport(String place_name, String sport_name, String address, String url, String contact_no, String email) {
		super();
		this.place_name = place_name;
		this.sport_name = sport_name;
		this.address = address;
		this.url = url;
		this.contact_no = contact_no;
		this.email = email;
	}

	public String getPlace_name() {
		return place_name;
	}

	public void setPlace_name(String place_name) {
		this.place_name = place_name;
	}

	public String getSport_name() {
		return sport_name;
	}

	public void setSport_name(String sport_name) {
		this.sport_name = sport_name;
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
		return "Sport [place_name=" + place_name + ", sport_name=" + sport_name + ", address=" + address + ", url="
				+ url + ", contact_no=" + contact_no + ", email=" + email + "]";
	}

	void sportList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                           --------------------List of the Sports--------------------");
		list.add(
				"                                                                                              1) Vidarbha Cricket Association");
		list.add(
				"                                                                                              2) Yashwant Stadium");
		list.add(
				"                                                                                              3) Indoor Sport Ground");
		list.add(
				"                                                                                              4) KP Ground");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

	void addSportsDetails() {
		ArrayList<Sport> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                        -----------------------------------------------------------------------");
		System.out.println(
				"                                                                              Enter the number of Sport where you want to visit First:");
		System.out.println(
				"                                                                        -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                      --------------------Welcome To The Vidarbha Cricket Association--------------------");
			list.add(new Sport("Nagpur", "Vidarbha Cricket Association",
					"!st Floor, CM Pavillion, Civil Lines, Nagpur 440001, Maharashtra State, India",
					"https://vac.co.in", "07122541908", "admin@vca.co.in"));
			break;

		case 2:
			System.out.println(
					"                                                                      --------------------Welcome To The Yashwant Stadium--------------------");
			list.add(new Sport("Nagpur", "Yashwant Stadium", "Abhayankar Marg, Dhantoli, NAgpur- 440012",
					"yashwantstadium.justdial.com", "07122541908", "admin@yashwantstadium.co.in"));
			break;

		case 3:
			System.out.println(
					"                                                                      --------------------Welcome To The Indoor Sport Ground--------------------");
			list.add(new Sport("Nagpur", "Indoor Sport Ground", "Koradi Rd, New Mankapur, Nagpur, Maharashtra- 440030",
					"https://isg.co.in", "07122541908", "admin@isg.co.in"));
			break;

		case 4:
			System.out.println(
					"                                                                     --------------------Welcome To The KP Ground--------------------");
			list.add(new Sport("Nagpur", "KP Ground", "National Highway 6, Mohan Nagar, Nagpur, Maharashtra- 440001",
					"https://kpground.co.in", "07122541908", "kpground@vca.co.in"));
			break;

		default:
			System.out.println(
					"                                                                     No Sport Places are Available !! Please choose the number from 1-4 !!");

		}

		Iterator<Sport> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}
}
