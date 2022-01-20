package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Food {
	String restarant_name;
	String contact;
	String address;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(String restarant_name, String contact, String address) {
		super();
		this.restarant_name = restarant_name;
		this.contact = contact;
		this.address = address;
	}

	public String getRestarant_name() {
		return restarant_name;
	}

	public void setRestarant_name(String restarant_name) {
		this.restarant_name = restarant_name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Food [restarant_name=" + restarant_name + ", contact=" + contact + ", address=" + address + "]";
	}

	void foodList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                      --------------------List Of Food Restaurants--------------------");
		list.add(
				"                                                                                          1) The BreakFast Story");
		list.add(
				"                                                                                          2) ayatri Bhojanalaya");
		list.add(
				"                                                                                          3) Barbeque Nation Nagpur");
		list.add(
				"                                                                                          4) Port O Gomez");
		list.add(
				"                                                                                          5) Nankinf Chinese Restaurant");
		list.add(
				"                                                                                          6) Gokul Brindavan");
		list.add(
				"                                                                                          7) Bawarchi Restaurant");
		list.add(
				"                                                                                          8) Indiaya Oye");
		list.add(
				"                                                                                          9) Naivedhyam Restaurant");
		list.add(
				"                                                                                          10) Mocha Cake Abd Bar");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

	void addFood() {
		ArrayList<Food> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		System.out.println(
				"                                                                       Enter the number of Food Restaurant where you want to visit First:");
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                       --------------------Welcome To The BreakFast Story--------------------");
			list.add(new Food("The BreakFast Story", "07122234170",
					"Sagar Apartment, D1-A Sai, 271, Hingna Rd, Opp. Transmitting Station, Nagpur, Maharashtra- 440036"));
			break;

		case 2:
			System.out.println(
					"                                                                       --------------------Welcome To Gayatri Bhojanalaya--------------------");
			list.add(new Food("Gayatri Bhojanalaya", "9860479091",
					"Behind Khandelwal Jewellers, W High Ct Rd, Dharampeth, Nagpur, Maharashtra- 440010"));
			break;

		case 3:
			System.out.println(
					"                                                                       --------------------Welcome To Barbeque Nation Nagpur--------------------");
			list.add(new Food("Barbeque Nation Nagpur", "18001086060",
					"2 Eternity Mall, Amravti Road, Variety Square, Sitabuldi, Nagpur, maharashtra- 440012"));
			break;

		case 4:
			System.out.println(
					"                                                                       --------------------Welcome To Port O Gomez--------------------");
			list.add(new Food("Port O Gomes", "9823054605",
					"10, Ambazari Rd, Daga Layout, Gandhi Layout, NAgpur, Maharashtra- 440010"));
			break;

		case 5:
			System.out.println(
					"                                                                       --------------------Welcome To Nankinf Chinese Restaurant--------------------");
			list.add(new Food("Nanking Chinese Restaurant", "07122531850",
					"167, Rabindranath Tagore Rd, Opp. Axis bank, Civil Lines, Nagpur, Maharashtra- 440001"));
			break;

		case 6:
			System.out.println(
					"                                                                       --------------------Welcome To Gokul Brindavan--------------------");
			list.add(new Food("Gokul Brindavan", "07122543007",
					"285, Hanuman Mandir Road, Dharampeth, Nagpur, Maharashtra- 440010"));
			break;

		case 7:
			System.out.println(
					"                                                                       --------------------Welcome To Bawarchi Restaurant--------------------");
			list.add(new Food("Bawarchi Restaurant", "07122234170",
					"Dass Jewellers, Vijay Arcade, 16, Ambazari Rd, nagpur, Maharashtra- 440010"));
			break;

		case 8:
			System.out.println(
					"                                                                       --------------------Welcome To Indiaya Oye--------------------");
			list.add(new Food("indiya Oye", "0860018000", "7, Wardha Rd, New Sneh Nagar, Nagpur, Maharashtra- 440015"));
			break;

		case 9:
			System.out.println(
					"                                                                       --------------------Welcome To Naivedhyam Restaurant--------------------");
			list.add(new Food("Naivedhyam Restaurant", "09326881013",
					"198-200 Rani Jhanshi Square, Maharashtra- 440012"));
			break;

		case 10:
			System.out.println(
					"                                                                       --------------------Welcome To Mocha Cake Abd Bar--------------------");
			list.add(new Food("Mocha Cake And Bar", "07126614637",
					"202, Cement Rd, Dharampeth Extension, Shivaji Nagar, Nagpur, Maharashtra- 440010"));
			break;

		default:
			System.out.println(
					"                                                                     No Food Restaurants are Available !! Please choose the number from 1-10 !!");
		}

		Iterator<Food> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
