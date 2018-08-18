package oops;

public abstract  class Santander implements Bank_Module, Mobile{

	@Override
	public void openAccount() {
		System.out.println("In santandr customer can open account in person only");
		
	}

	@Override
	public void choseAccountType() {
		System.out.println("In santandr customer can chose account in person only");
		
	}

	@Override
	public void updateInfo() {
		System.out.println("In santandr customer can update account in person only");
	}

	@Override
	public void deleteAccount() {
		System.out.println("In santandr customer can delete account in person only");
		
	}

	@Override
	public void appCalling() {
		System.out.println("In santandr customer can not use appcalling");
	}

	@Override
	public abstract void onlineDeposit();
		

}
