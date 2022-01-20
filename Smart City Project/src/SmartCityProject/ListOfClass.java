package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListOfClass {
	ArrayList<String> list = new ArrayList<>();

	public void show() {

		list.add(
				"                                                                                              1) Attraction");
		list.add(
				"                                                                                              2) College");
		list.add(
				"                                                                                              3) Food");
		list.add(
				"                                                                                              4) Hospital");
		list.add(
				"                                                                                              5) Hotel");
		list.add(
				"                                                                                              6) Industry");
		list.add(
				"                                                                                              7) NightLife");
		list.add(
				"                                                                                              8) ShoppingMall");
		list.add(
				"                                                                                              9) Sport");
		list.add(
				"                                                                                              10) Transportation");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

	void display() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                          ===========================================================");
		System.out.println(
				"                                                                             Enter the Number of Spot Where you want to visit First:");
		System.out.println(
				"                                                                          ===========================================================");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                                                Attraction");
			System.out.println(
					"                                                                                              **************");
			System.out.println(
					"                                                                                          Press 1 for more details");
			System.out.println(
					"                                                                                       *****************************");
			break;

		case 2:
			System.out.println(
					"                                                                                                 College");
			System.out.println(
					"                                                                                              **************");
			System.out.println(
					"                                                                                          Press 2 for more details");
			System.out.println(
					"                                                                                       *****************************");
			break;

		case 3:
			System.out.println(
					"                                                                                                   Food");
			System.out.println(
					"                                                                                              **************");
			System.out.println(
					"                                                                                          Press 3 for more details");
			System.out.println(
					"                                                                                       *****************************");
			break;

		case 4:
			System.out.println(
					"                                                                                                 Hospital");
			System.out.println(
					"                                                                                              **************");
			System.out.println(
					"                                                                                          Press 4 for more details");
			System.out.println(
					"                                                                                       *****************************");
			break;

		case 5:
			System.out.println(
					"                                                                                                  Hotel");
			System.out.println(
					"                                                                                              **************");
			System.out.println(
					"                                                                                          Press 5 for more details");
			System.out.println(
					"                                                                                       *****************************");
			break;

		case 6:
			System.out.println(
					"                                                                                                 Industry");
			System.out.println(
					"                                                                                              **************");
			System.out.println(
					"                                                                                          Press 6 for more details");
			System.out.println(
					"                                                                                       ****************************");
			break;

		case 7:
			System.out.println(
					"                                                                                                 NightLife");
			System.out.println(
					"                                                                                              **************");
			System.out.println(
					"                                                                                          Press 7 for more details");
			System.out.println(
					"                                                                                       *****************************");
			break;

		case 8:
			System.out.println(
					"                                                                                               ShoppingMall");
			System.out.println(
					"                                                                                              **************");
			System.out.println(
					"                                                                                          Press 8 for more details");
			System.out.println(
					"                                                                                       *****************************");
			break;

		case 9:
			System.out.println(
					"                                                                                                  Sport");
			System.out.println(
					"                                                                                              **************");
			System.out.println(
					"                                                                                          Press 9 for more details");
			System.out.println(
					"                                                                                       *****************************");
			break;

		case 10:
			System.out.println(
					"                                                                                               Transportation");
			System.out.println(
					"                                                                                              ****************");
			System.out.println(
					"                                                                                          Press 10 for more details");
			System.out.println(
					"                                                                                       *****************************");
			break;

		default:
			System.out.println(
					"                                            ----------------------------Please Enter the Valid Number For Visiting the Nagpur's Spots (From 1-10)------------------------------");

		}

	}

}