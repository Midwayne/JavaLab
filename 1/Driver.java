package ans1;


public class Driver {
	
	public static void main(String[] args) {

		while(true) {
	
			System.out.println("1.New Contact\n2.New missed Call\n3.Display phBook\n4.Display missed call\n5.Delete contact\n6.EXIT");
			System.out.println("Enter your choice: ");
			int i = DataBaseCaller.sc.nextInt();
			
			switch(i) {
			case 1:
				DataBaseCaller.addNewContact();
				break;
			case 2:
				DataBaseCaller.addMissedCall();
				break;
			case 3:
				DataBaseCaller.displayPhoneBook();
				break;
			case 4:
				DataBaseCaller.getMissedCall();
				break;
			case 5:
				DataBaseCaller.deleteContact();
				break;
			case 6:
				System.exit(0);
			default:
				break;
			}	
		}
	}
}
