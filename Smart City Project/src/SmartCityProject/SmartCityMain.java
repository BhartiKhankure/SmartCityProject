package SmartCityProject;

import java.util.Scanner;

public class SmartCityMain {

	public static void main(String[] args) {
		System.out.println(
				"===============================================================================================================================================================================================================");
		System.out.println(
				"                                                                                            Welcome To Nagpur");
		System.out.println(
				"===============================================================================================================================================================================================================");
		SmartCityManage();
	}

	private static void SmartCityManage() {
		System.out.println(
				"                                                                                      List Of Spots in Our Nagpur City");
		System.out.println(
				"                                                                        ===========================================================");
		ListOfClass loc = new ListOfClass();
		loc.show();
		loc.display();

		char choice;
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			Attraction attr = new Attraction();
			attr.attractlist();
			attr.addAttraction();
			break;

		case 2:
			College clg = new College();
			clg.collegeList();
			clg.addCollegeDetails();
			break;

		case 3:
			Food fd = new Food();
			fd.foodList();
			fd.addFood();
			break;

		case 4:
			Hospital hosp = new Hospital();
			hosp.hospitalList();
			hosp.addHospitalDetails();
			break;

		case 5:
			HotelManagement hotel = new HotelManagement();
			hotel.hotelList();
			hotel.addHotelDetails();
			break;

		case 6:
			Industry ind = new Industry();
			ind.industryList();
			ind.addIndustryDetails();
			break;

		case 7:
			NightLife nl = new NightLife();
			nl.nightlifeList();
			nl.addNightLifeDetails();
			break;

		case 8:
			ShoppingMall mall = new ShoppingMall();
			mall.shoppinglist();
			mall.addShopping();
			break;

		case 9:
			Sport sp = new Sport();
			sp.sportList();
			sp.addSportsDetails();
			break;

		case 10:
			Transportation transport = new Transportation();
			transport.transportList();
			transport.addTransportDetails();
			break;

		default:
			System.out.println("No option");
		}
		System.out.println(
				"                                                                                    =========================================");
		System.out.println(
				"                                                                                      Want To Visit Somewhere Else? (y/n)");
		System.out.println(
				"                                                                                    ==========================================");
		choice = scanner.next().charAt(0);
		if (choice == 'y' || choice == 'Y') {
			SmartCityManage();

		} else {
			System.out.println(
					"                                                                                            **************************");
			System.out.println(
					"                                                                                                Thanks For VSisiting");
			System.out.println(
					"                                                                                            **************************");
		}
	}
}
