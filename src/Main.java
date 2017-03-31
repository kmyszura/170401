
public class Main {
	public static void main(String args[]){
		Account A1 = new Account ("ROR","5555 4444 4444 3333");
		Transaction check = new Check(A1);
		check.doTransaction();
		check.stopTransaction();
		check.deleteTransaction();
		
		Account A2 = new Account ("HSA","222 4444 4444 6666");		
		Transaction deposit = new Deposit(A2);
		deposit.doTransaction();
		deposit.stopTransaction();
		deposit.deleteTransaction();
		
		Transaction transfer = new Transfer(A1,A2,"35a2ghip");
		transfer.doTransaction();
		transfer.stopTransaction();
		transfer.deleteTransaction();

		System.out.println();
		Client C1 = new Client("Maciej","Majewski","Wroclaw","Poland","12-900","Marynarska",70);
		System.out.println(C1.Firstname+"|"+C1.Lastname+"|"+C1.City+"|"+C1.State+"|"+C1.Zip+"|"+C1.Street+"|"+C1.Number);
		Bank B1 = new Bank("BGZ","Warsaw","Poland","00-001","Poleczki",1);
		System.out.println(B1.Name+"|"+B1.City+"|"+B1.State+"|"+B1.Zip+"|"+B1.Street+"|"+B1.Number);
		System.out.println();
		
		SingletonTransaction trial = SingletonTransaction.getInstance();
		trial.doTransaction();
		trial.stopTransaction();
		trial.deleteTransaction();
		
	}

}
