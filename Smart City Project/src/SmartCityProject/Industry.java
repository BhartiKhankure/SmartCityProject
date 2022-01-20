package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Industry {
	String name;
	String address;
	String url;
	String contact_no;
	String email;

	public Industry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Industry(String name, String address, String url, String contact_no, String email) {
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
		return "Industry [name=" + name + ", address=" + address + ", url=" + url + ", contact_no=" + contact_no
				+ ", email=" + email + "]";
	}

	void industryList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                       --------------------List of the Industry--------------------");
		list.add(
				"                                                                                             1) IT Park Nagpur");
		list.add(
				"                                                                                             2) MIDC Hingna");
		list.add(
				"                                                                                             3) Mihan");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

	void addIndustryDetails() {
		ArrayList<Industry> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		System.out.println(
				"                                                                          Enter the number of Industry where you want to visit First:");
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                      --------------------Welcome To The IT Park Nagpur--------------------");
			list.add(new Industry("IT Park Nagpur", "Parsodi, Subhash Nagar, Pratap Nagar, Nagpur, Maharashtra- 440022",
					"    ", "   ", "   "));

			break;

		case 2:
			System.out.println(
					"                                                                      --------------------Welcome To The MIDC Hingna--------------------");
			list.add(new Industry("MIDC Hingna", "Hingna NilDoh, Maharashtra- 440016",
					"https://mianagpur.com/companies-list/", "   ", "   "));
			break;

		case 3:
			System.out.println(
					"                                                                      --------------------Welcome To The Mihan--------------------");
			list.add(new Industry("Mihan", "WHC Road, Aath Rasta Square, Laxmi Nagar, Nagpur, Maharashtra-440022",
					"mihansez.org", "8999350858", "   "));
			break;

		default:
			System.out.println(
					"                                                         No Industries are Available !! Please choose the number from 1-8 !!");
		}

		Iterator<Industry> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
