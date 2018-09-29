package _01_Singleton;

public class _01_Singleton_lh_04 {
Singleton_lh_04 singleton_lh_04 = Singleton_lh_04.getInstance();
}

class Singleton_lh_04{
	private static class  lazy_holder {
		private static final Singleton_lh_04 INSTANCE = new Singleton_lh_04();
	}
	private Singleton_lh_04() {};
	public static Singleton_lh_04 getInstance() {
		return lazy_holder.INSTANCE;
	}
}