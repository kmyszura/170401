
public class Transfer implements Transaction{
	public Account accountTo;
	public Account accountFrom;
	public String SWIFT;
	public Transfer(Account accountFromIn, Account accountToIn, String SWIFTIn){
		accountFrom = accountFromIn;
		accountTo = accountToIn;
		SWIFT = SWIFTIn;
	}
	@Override
	public void doTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Transfer doTransaction from "+accountFrom.Name+" to "+accountTo.Name+", SWIFT: "+SWIFT);
	}
	@Override
	public void stopTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Transfer stopTransaction from "+accountFrom.Name+" to "+accountTo.Name+", SWIFT: "+SWIFT);		
	}
	@Override
	public void deleteTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Transfer deleteTransaction from "+accountFrom.Name+" to "+accountTo.Name+", SWIFT: "+SWIFT);		
	}
	
}
