
public class Deposit implements Transaction{
	public Account accountFrom;
	public Deposit(Account accountFromIn){
		accountFrom = accountFromIn;
	}
	@Override
	public void doTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Deposit doTransaction from "+accountFrom.Name);
	}
	@Override
	public void stopTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Deposit stopTransaction from "+accountFrom.Name);
	}
	@Override
	public void deleteTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Deposit deleteTransaction from "+accountFrom.Name);
	}
}
