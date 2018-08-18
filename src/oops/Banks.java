package oops;

public class Banks {
	/* Write an java application using all the OOP features. Include few
	 constructors in class*/

	private String customeName;
	private int ActId;
	private String AccountType;
	public int depositAmount;
	
	Banks() {
		
	}
	Banks(String customeName, String AccountType, int ActId) {
		this.customeName=customeName;
		this.AccountType=AccountType;
		this.ActId=ActId;
	}

	Banks(int depositAmount) {
		this.depositAmount=depositAmount;

	}
	
	public String getCustomeName() {
		return customeName;
	}

	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}

	public int getActId() {
		return ActId;
	}

	public void setActId(int ActId) {
		this.ActId = ActId;
	}

	public String getAccountType() {
	
		return AccountType;
	}

	public void setAccountType(String AccountType) {
		this.AccountType = AccountType;
	}

	public int getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	
	public  void deleteAccount() {
		System.out.println("Account is deleted");
		
	}
	public  void updateAccount() {
		System.out.println("Account is updated");
		
	}
	
	public void download() {
		System.out.println("TD custometer can download td mobile app");
	
	}
	public void appCalling() {
		System.out.println("TD customer can call using td mobile app");
		
	}
	
	

	

}
