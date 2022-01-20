package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ShoppingMall {
	String shop_name;
	String shop_address;
	String shop_url;

	public ShoppingMall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingMall(String shop_name, String shop_address, String shop_url) {
		super();
		this.shop_name = shop_name;
		this.shop_address = shop_address;
		this.shop_url = shop_url;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public String getShop_address() {
		return shop_address;
	}

	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}

	public String getShop_url() {
		return shop_url;
	}

	public void setShop_url(String shop_url) {
		this.shop_url = shop_url;
	}

	@Override
	public String toString() {
		return "ShoppingMall [shop_name=" + shop_name + ", shop_address=" + shop_address + ", shop_url=" + shop_url
				+ "]";
	}

	void shoppinglist() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                          --------------------List Of Shopping Malls--------------------");
		list.add(
				"                                                                                                 1) Bardi");
		list.add(
				"                                                                                                 2) Central Mall");
		list.add(
				"                                                                                                 3) Empress Mall");
		list.add(
				"                                                                                                 4) Eternity Mall");
		list.add(
				"                                                                                                 5) Fortune Mall");
		list.add(
				"                                                                                                 6) Jaswant Tuli Mall");
		list.add(
				"                                                                                                 7) D'Mart");
		list.add(
				"                                                                                                 8) Lotus Electronic");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

	void addShopping() {
		ArrayList<ShoppingMall> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		System.out.println(
				"                                                                              Enter the number for showing the shopping mall detail:");
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                       --------------------Welcome To The Bardi--------------------");
			list.add(new ShoppingMall("Bardi",
					"Amravti Road, Jhansi Rani Square, Sitabuldi, Nagpur, Maharashtra- 440012",
					"https://bardi.ac.in/"));
			break;

		case 2:
			System.out.println(
					"                                                                       --------------------Welcome To The Central Mall--------------------");
			list.add(new ShoppingMall("Central Mall",
					"Punam Mall, Khasra No 91 Vip Road, Opposite Alankar Theater, Shankar Nagar, East Shankar Nagar, Ramdaspeth, Nagpur, Maharashtra- 440002",
					"https://centralandme.com"));
			break;

		case 3:
			System.out.println(
					"                                                                       --------------------Welcome To The Empress Mall--------------------");
			list.add(new ShoppingMall("Empress Mall", "Empress Mills Chawl Empress city Nagpur, Maharashtra- 440018",
					"https://empressmall.ac.in/"));
			break;

		case 4:
			System.out.println(
					"                                                                       --------------------Welcome To The Eternity Mall--------------------");
			list.add(new ShoppingMall("Eternity Mall",
					"Eternity Mall, Amravti Rd, Variety Square, Gorepeth, Nagpur, Maharashtra- 440012",
					"https://eternitymall.com/"));
			break;

		case 5:
			System.out.println(
					"                                                                       --------------------Welcome To The Fortune Mall--------------------");
			list.add(new ShoppingMall("Fortune Mall",
					"Near Jhansi Rani Square, Buty Marg, Sitabuldi, Nagpur, Maharashtra- 440012",
					"https://fortune-mall.business.site/"));
			break;

		case 6:
			System.out.println(
					"                                                                       --------------------Welcome To The Jaswant Tuli Mall--------------------");
			list.add(new ShoppingMall("Jaswant Tuli Mall",
					"Kamptee Rd, Near Indora Chowk, Balabhaupeth, Nagpur, Maharashtra- 440017",
					"https://www.jaswanttuligroup.com"));
			break;

		case 7:
			System.out.println(
					"                                                                       --------------------Welcome To The D'Mart--------------------");
			list.add(
					new ShoppingMall("D'Mart", "X 25/26, Commercial Zone, MIDC Hingna Road Nagpur, Maharashtra- 440016",
							"https://business.google.com/wesite/seema-sales-corporation"));
			break;

		case 8:
			System.out.println(
					"                                                                      --------------------Welcome To The Lotus Electronic--------------------");
			list.add(new ShoppingMall("Lotus Electronic",
					"Platina Enclave 13 Ambazari Road Opp. New Wockhardt Hospital, Shankar Nagar, Nagpur, Maharashtra- 440010",
					"https://bardi.ac.in/"));
			break;

		default:
			System.out.println(
					"                                                                          No Malls are Available !! Please choose the number from 1-8 !!");
		}

		Iterator<ShoppingMall> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

}
