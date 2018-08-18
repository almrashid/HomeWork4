package oops;

public class Chase extends Banks implements Bank_Module, Mobile {

	@Override
	public void openAccount() {
		System.out.println("Chase account can be opened in person");

	}

	@Override
	public void choseAccountType() {
		System.out.println("Chase customer need to choose account type at the time of opening account");

	}

	@Override
	public void updateInfo() {
		System.out.println("Chase clients can update info in online also");

	}

	@Override
	public void deleteAccount() {
		System.out.println("chase don't delete account without specific reason");

	}

	@Override
	public void appCalling() {
		System.out.println("It does provide appcalling features");
	}

	@Override
	public void onlineDeposit() {
		System.out.println("chase support online deposit");

	}

	

}
