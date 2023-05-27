package ans1;

import java.util.*;

public class DataBaseCaller {
	
	private static HashMap<Long, String> phBook = new HashMap<>();
	private static LinkedList<MissedCallDetails> miss = new LinkedList<>();
	
	static Scanner sc = new Scanner(System.in);
	
	static {
		phBook.put(6872687216l, "Person 1");
		phBook.put(6515466854l, "Person 2");
		phBook.put(6125411354l, "Person 3");
		phBook.put(6515141545l, "Person 4");
	}
	
	public static void addNewContact() {
		System.out.println("Enter the number: ");
		long phno = sc.nextLong();
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		
		name+=sc.nextLine();
		
		if(phBook.put(phno, name)!=null) {
			System.out.println("Already exists!");
		}
	}
	
	public static void displayPhoneBook() {
		System.out.println("\nPhoneBook\n");
		for(Map.Entry<Long,String> i : phBook.entrySet()) {
			System.out.println("Name: " + i.getValue() + " | Phone: " + i.getKey());
		}
	}
	
	public static void deleteContact () {
		System.out.println("Enter phone number: ");
		long phno = sc.nextLong();
		if(phBook.remove(phno)==null) {
			System.out.println("Does not exist");
		}
		else {
			System.out.println("Exists");
		}
	}
	
	public static void addMissedCall() {
		System.out.println("Enter phone number: ");
		long phno = sc.nextLong();
		
		Calendar cal = Calendar.getInstance();
		miss.addFirst(new MissedCallDetails(cal, phno));
	}
	
	public static void getMissedCall() {
		for(MissedCallDetails i: miss) {
			String name = phBook.get(i.phno);
			
			if(name==null) {
				System.out.println("Private caller");
			}
			else {
				System.out.println("Name: "+ name + " | Phone: "+ i.phno +" | Time: " + i.cal.getTime());
			}
			
		}
	}
	
}
