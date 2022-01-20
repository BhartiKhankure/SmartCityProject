package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class College {
	String clg_name;
	String clg_address;
	String clg_url;
	String clg_contact_no;
	String clg_email;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String clg_name, String clg_address, String clg_url, String clg_contact_no, String clg_email) {
		super();
		this.clg_name = clg_name;
		this.clg_address = clg_address;
		this.clg_url = clg_url;
		this.clg_contact_no = clg_contact_no;
		this.clg_email = clg_email;
	}

	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	public String getClg_address() {
		return clg_address;
	}

	public void setClg_address(String clg_address) {
		this.clg_address = clg_address;
	}

	public String getClg_url() {
		return clg_url;
	}

	public void setClg_url(String clg_url) {
		this.clg_url = clg_url;
	}

	public String getClg_contact_no() {
		return clg_contact_no;
	}

	public void setClg_contact_no(String clg_contact_no) {
		this.clg_contact_no = clg_contact_no;
	}

	public String getClg_email() {
		return clg_email;
	}

	public void setClg_email(String clg_email) {
		this.clg_email = clg_email;
	}

	@Override
	public String toString() {
		return "College [clg_name=" + clg_name + ", clg_address=" + clg_address + ", clg_url=" + clg_url
				+ ", clg_contact_no=" + clg_contact_no + ", clg_email=" + clg_email + "]";
	}

	void collegeList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                         --------------------List of the Colleges--------------------");
		list.add(
				"                                                                           1) Vishwesvaraya National Institute Of Technology, Nagpur");
		list.add(
				"                                                                           2) Government Medical College Abd Hospital, Nagpur");
		list.add(
				"                                                                           3) Shri Ramdeobaba College Of Engineering And Mahanement, Nagpur");
		list.add(
				"                                                                           4) Laxminarayan Institute Of Technology, Nagpur");
		list.add(
				"                                                                           5) Priyadarshini College Of Engineering, Nagpur");
		list.add(
				"                                                                           6) Priyadarshini Institute Of Engineering And Technology, Nagpur");
		list.add(
				"                                                                           7) G. H. Raisoni College of Engineering, Nagpur");
		list.add(
				"                                                                           8) Yashawantrao Chavan College Of Engineering, Nagpur");

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

	void addCollegeDetails() {
		ArrayList<College> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		System.out.println(
				"                                                                               Enter the number of college where you want to visit first:");
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                   --------------------Welcome To The Vishwesvaraya National Institute Of Technology, Nagpur--------------------");
			list.add(new College("Vishwesvaraya National Institute Of Technology, Nagpur",
					"Vishwesvaraya National Institute Of Technology, South Ambazri Road, Nagpur, Maharashtra- Pin 440010 (India)",
					"https://vnit.ac.in/", "07122801535", "dr_acd@vnit.ac.in"));
			break;

		case 2:
			System.out.println(
					"                                                   --------------------Welcome To The Government Medical College Abd Hospital, Nagpur--------------------");
			list.add(new College("Government Medical College Abd Hospital, Nagpur",
					"Medical Chawk, Hanuman Nagar, Nagpur, Maharashtra- 440009", "https://www.gmcnagpur.gov.in",
					"07122744671", "deangmc2@gmail.com"));
			break;

		case 3:
			System.out.println(
					"                                                   --------------------Welcome To The Shri Ramdeobaba College Of Engineering And Mahanement, Nagpur--------------------");
			list.add(new College("Shri Ramdeobaba College Of Engineering And Mahanement, Nagpur",
					"Shri Ramdeobaba College Of Engineering And Mahanement, Ramdeo Tekdi, Katol Rd, Gittikhadan, Nagpur, Maharashtra-440013",
					"https://www.rknec.edu/", "9607980531", "rknec@edu.com"));
			break;

		case 4:
			System.out.println(
					"                                                   --------------------Welcome To The Laxminarayan Institute Of Technology, Nagpur--------------------");
			list.add(new College("Laxminarayan Institute Of Technology, Nagpur",
					"Amravti Road, Ram Nagar, Nagpur, Maharashtra- 440033", "http://litnagpur.org/", "7122531659",
					"rajumankar@gmail.com"));
			break;

		case 5:
			System.out.println(
					"                                                   --------------------Welcome To The Priyadarshini College Of Engineering, Nagpur--------------------");
			list.add(new College("Priyadarshini College Of Engineering, Nagpur",
					"Priyadarshini Campus, Hingna Rd, Digdoh Hills, nagpur, Maharashtra- 440019",
					"https://www.pcenagpur.edu.in/", "9975451563", "mpsingh3712@rediffmail.com"));
			break;

		case 6:
			System.out.println(
					"                                                  --------------------Welcome To The Priyadarshini Institute Of Engineering And Technology, Nagpur--------------------");
			list.add(new College("Priyadarshini Institute Of Engineering And Technology, Nagpur",
					"Priyadarshini Campus, Hingna Rd, Digdoh Hills, nagpur, Maharashtra- 440019",
					"https://www.piet.edu.in/", "9823887625", "principalpiet1@gmail.com"));
			break;

		case 7:
			System.out.println(
					"                                                  --------------------Welcome To The G. H. Raisoni College of Engineering, Nagpur--------------------");
			list.add(new College("G. H. Raisoni College of Engineering, Nagpur",
					"CRPF Gate, No.3, Hingna Rd, Digdoh Hills, Nagpur, Maharashtra- 440016",
					"https://ghrce.raisoni.net/", "9604787184", "Principal@Raisoni.Net"));
			break;

		case 8:
			System.out.println(
					"                                                 --------------------Welcome To The Yashawantrao Chavan College Of Engineering, Nagpur--------------------");
			list.add(new College("Yashawantrao Chavan College Of Engineering, Nagpur",
					"Wanadongri ct, Nagpur, Maharashtra- 441110", "https://vnit.ac.in/", "07122801535",
					"dr_acd@vnit.ac.in"));
			break;

		default:
			System.out.println(
					"                                                                       No Colleges are Available !! Please choose the number from 1-8 !!                                                       ");
		}

		Iterator<College> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
