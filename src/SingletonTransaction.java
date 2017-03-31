
public class SingletonTransaction {
	private static SingletonTransaction instance = null;
	private SingletonTransaction(){
		
	}
	public static SingletonTransaction getInstance(){
		if(instance==null){
			instance = new SingletonTransaction();
		}
		//return new MyFirstSingleton();
		return instance;		
	}
	protected static void doTransaction() {
	      System.out.println("doTransaction for Singleton");
	}
	protected static void stopTransaction() {
	      System.out.println("stopTransaction for Singleton");
	}
	protected static void deleteTransaction() {
	      System.out.println("deleteTransaction for Singleton");
	}
}
