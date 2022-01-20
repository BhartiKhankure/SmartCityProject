package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hospital {
	String hospital_name;
	String hospital_address;
	String hospital_contact;
	String hospital_url;
	String hospital_email;

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(String hospital_name, String hospital_address, String hospital_contact, String hospital_url,
			String hospital_email) {
		super();
		this.hospital_name = hospital_name;
		this.hospital_address = hospital_address;
		this.hospital_contact = hospital_contact;
		this.hospital_url = hospital_url;
		this.hospital_email = hospital_email;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public String getHospital_address() {
		return hospital_address;
	}

	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}

	public String getHospital_contact() {
		return hospital_contact;
	}

	public void setHospital_contact(String hospital_contact) {
		this.hospital_contact = hospital_contact;
	}

	public String getHospital_url() {
		return hospital_url;
	}

	public void setHospital_url(String hospital_url) {
		this.hospital_url = hospital_url;
	}

	public String getHospital_email() {
		return hospital_email;
	}

	public void setHospital_email(String hospital_email) {
		this.hospital_email = hospital_email;
	}

	@Override
	public String toString() {
		return "Hospital [hospital_name=" + hospital_name + ", hospital_address=" + hospital_address
				+ ", hospital_contact=" + hospital_contact + ", hospital_url=" + hospital_url + ", hospital_email="
				+ hospital_email + "]";
	}

	void hospitalList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                        --------------------List of the hospitals--------------------");
		list.add(
				"                                                                                            1) Government Hospital");
		list.add(
				"                                                                                            2) Indira Gandhi Hospital");
		list.add(
				"                                                                                            3) Lata Mangeshkar hospital");
		list.add(
				"                                                                                            4) Care Hospital");
		list.add(
				"                                                                                            5) Wockart Hospital");
		list.add(
				"                                                                                            6) SueTech Hospital");
		list.add(
				"                                                                                            7) Mure Hospital");
		list.add(
				"                                                                                            8) Hope Hospital");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

	void addHospitalDetails() {
		ArrayList<Hospital> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		System.out.println(
				"                                                                            Enter the number of hospital where you want to visit First:");
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                      --------------------Welcome To The Government Hospital--------------------");
			list.add(new Hospital("Government Hospital",
					"Government Medical College Near Hanuman Nagar, Nagpur, Maharashtra- 440009",
					"https://www.gmcnagpur.gov.in", "07121744671", "deangmc2@gmail.com"));

			break;

		case 2:
			System.out.println(
					"                                                                      --------------------Welcome To The Indira Gandhi Hospital--------------------");
			list.add(new Hospital("Indira Gandhi Hospital",
					"Indira Gandhi Government Medical College Hospital, C> A. Road, Nagpur", "https://www.iggmc.org",
					"07122725423", "iggmc@rediffmail.com"));
			break;

		case 3:
			System.out.println(
					"                                                                      --------------------Welcome To Th Lata Mangeshkar hospital--------------------");
			list.add(new Hospital("Lata Mangeshkar hospital",
					"Digdoh Hills, Hingna Road, Near, CRPF Rd, Near Priyadarshini College, Nagpur, Maharashtra- 440019",
					"https://www.latamangeshkarnagpur.gov.in", "07104665000", "lmhn@gmail.com"));
			break;

		case 4:
			System.out.println(
					"                                                                      --------------------Welcome To The Care Hospital--------------------");
			list.add(new Hospital("Care Hospital",
					"3 Wardha Road Ramdaspeth Panchsheel Square, Farmland, Nagpur, Maharashtra- 420012",
					"https://www.carehospitals.com/unit-nagpur", "07123982222", "dcarehospitals@gmail.com"));
			break;

		case 5:
			System.out.println(
					"                                                                      --------------------Welcome To The Wockart Hospital--------------------");
			list.add(new Hospital("Wockart Hospital", "1643, North Ambazari Road, Nagpur- 440033",
					"nagpur2.wockhardthospitals.com", "07126624444", "enquire@wockhardthospitals.com"));
			break;

		case 6:
			System.out.println(
					"                                                                      --------------------Welcome To The SueTech Hospital--------------------");
			list.add(new Hospital("SueTech Hospital", "13A, Banargee Marg, Dhantoli, Nagpur, Maharashtra- 440012",
					"https://suretech-hospital-research-center.business.site/", "07126636822",
					"enquire@sureTech.hospitals.com"));
			break;

		case 7:
			System.out.println(
					"                                                                      --------------------Welcome To The Mure Hospital--------------------");
			list.add(new Hospital("Mure Hospital", "MaharajBagh Rd, Sitabuldi, Nagpur, Maharashtra- 440001",
					"https://www.murememorialhospital.org/", "07122522370", "murerhospi@yahoo.com"));
			break;

		case 8:
			System.out.println(
					"                                                                      --------------------Welcome To The Hope Hospital--------------------");
			list.add(new Hospital("Hope Hospital", "Beside Gogas Auto LPG, 2, Kamtee Rd, Nagpur, Maharashtra- 440017",
					"https://www.hopehospital.com", "9373111709", "hopehospital@gmail.com"));
			break;

		default:
			System.out.println(
					"                                                                       No Hospitals are Available !! Please choose the number from 1-8 !!");
		}

		Iterator<Hospital> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
