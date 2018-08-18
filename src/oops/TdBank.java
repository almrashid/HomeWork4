package oops;

public class TdBank extends Banks implements Bank_Module,Mobile {


	public void openAccount() {
		System.out.println("TD coustomer can open account online and in person");

	}
	public void choseAccountType() {
		System.out.println("TD coustomer chose account type - savings or checking");

	
	}


	public void updateInfo() {
		System.out.println("TD coustomer can update account information online and in person");

	}


	public void deleteAccount() {
		System.out.println("TD coustomer can only delete account  in person");

		
	}



	public void appCalling() {
		System.out.println("TD coustomer can call customer service using app");
		
	}


	public void onlineDeposit() {
		System.out.println("Td bank support online deposit");
		
	}


}
