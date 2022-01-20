package SmartCityProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Transportation {
	String place;
	String address;
	String url;
	String email;
	String contact_no;
	String transprt_desc;

	public Transportation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transportation(String place, String address, String url, String email, String contact_no,
			String transprt_desc) {
		super();
		this.place = place;
		this.address = address;
		this.url = url;
		this.email = email;
		this.contact_no = contact_no;
		this.transprt_desc = transprt_desc;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getTransprt_desc() {
		return transprt_desc;
	}

	public void setTransprt_desc(String transprt_desc) {
		this.transprt_desc = transprt_desc;
	}

	@Override
	public String toString() {
		return "Transportation [place=" + place + ", address=" + address + ", url=" + url + ", email=" + email
				+ ", contact_no=" + contact_no + ", transprt_desc=" + transprt_desc + "]";
	}

	void transportList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(
				"                                                                            --------------------List of the Transports--------------------");
		list.add(
				"                                                                                                 1) Railway Station");
		list.add(
				"                                                                                                 2) Airport Nagpur");
		list.add(
				"                                                                                                 3) Bus Stop");
		list.add(
				"                                                                                                 4) Metro Station");
		list.add(
				"                                                                                                 5) Morbhavan");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

	void addTransportDetails() {
		ArrayList<Transportation> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		System.out.println(
				"                                                                            Enter the number of Transport where you want to visit First:");
		System.out.println(
				"                                                                     -----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					"                                                                     --------------------Welcome To The Railway Station--------------------");
			list.add(new Transportation("Railway Station", "Sitabuldi Nagpur, Maharashtra- 440001",
					"https://cr.indianrailways.gov.in/view_section.jsp?lang=0 id=0,6,1191,1196",
					"drm@ngprailnet.gov.in", "9632568945",
					"Nagpur Junction Railway Station is one of the oldest and busiest station in Maharashtra, India. In 1867, Mumbai rail first connected to Nagpur. "
							+ "In 1881, Nagpur was connected to Kolkata via the Nagpur State Railway of Chhattisgarh. It was officially inaugurated on 15 January 1925 by the Governer Sir Frank Sly. "
							+ "Prior to 1924, the Nagpur Railway Junction Station was located east of its current location. Nagpur Junction Railway Station became a major tourist destination."));
			break;

		case 2:
			System.out.println(
					"                                                                     --------------------Welcome To The Airport Nagpur--------------------");
			list.add(new Transportation("Airport Nagpur",
					"Dr. Babasaheb Ambedkar International Airport Nagpur- 440005 (Maharashtra) India",
					"https://www.nagpurairport.com/", "contact@mihanindia.in", "7122807501",
					"Dr. Babasaheb Ambedkar International Airport(IATA: NAG, ICAO: VANP) is an internation airport serving the city of Nagpur, Maharashtra, India. "
							+ "The Airport is located at Sonegaon, 8km(5mi) South-West of Nagpur. The airport covers an area of 1355 acres (548 hectares). "
							+ "In 2005, it was named after B. R. Ambedkar, the chief architect of the Indian Constitution. "
							+ "The airport handles around 4,000 passangers per day and caters to five domestic airlines connecting Nagpur to Sharjah, doha and 11 domestic destination."));
			break;

		case 3:
			System.out.println(
					"                                                                      --------------------Welcome To The Bus Stop--------------------");
			list.add(new Transportation("Bus Stop",
					"Ganesh Peth, NAgpur- 440018, Near Baidyanath Chowk, Near Madyaverti Bus Stand Opposite Ashirvad cinema mall",
					"www.msrtc.gov.in", "msrtchelpdesk@gmail.com", "7122726221",
					"Nagpur is a major road Junction, since India's two major national highways (NH-7 from KanyaKumari to Varanasi and NH-6 from Hajira to Kolkata) pass through the city. "
							+ "NH 69 connects Nagpur to Obaidullaganj, near Bhopal. Nagpur is at the junction of two Asia Highways: AH43 (Agra to Matara, Sri Lanka) and AH46 (Kharagpur to Dhule). "
							+ "The Inland Container Depot, run by Container Corporation of India (CONCOR), has been the country's fastest- growing inland port."));
			break;
		case 4:
			System.out.println(
					"                                                                      --------------------Welcome To The Metro Station--------------------");
			list.add(new Transportation("Railway Station",
					"Metro House, Bunglow No: 28/2, Aanand Nagar, C K Naidu Road, Civil Lines, Nagpur - 440001",
					"https://www.metrorailnagpur.com/", "contactus@mahametro.org", "07122554217", "     "));
			break;

		case 5:
			System.out.println(
					"                                                                      --------------------Welcome To The Morbhavan--------------------");
			list.add(new Transportation("Morbhavan",
					"Nit Complex, P/38, Aadivasi Gowari Shahid Uddan Pul, Sitabuldi, Nagpur- 440010",
					"https://www.nagpurpeople.com/NagpurBusiness/Computer-And-IT.aspx", "drm@nagpurpeople.gov.in",
					"18002335665", "  "));
			break;

		default:
			System.out.println(
					"                                                                     No Transportations are Available !! Please choose the number from 1-5 !!");
		}

		Iterator<Transportation> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
