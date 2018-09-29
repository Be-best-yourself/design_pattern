package _01_Singleton;

public class _01_Singleton_lh_03 {

}
class Singleton_lh_03{
	private Singleton_lh_03() {};
	private static Singleton_lh_03 single = null;
	private static synchronized Singleton_lh_03 getInstance() {
		if(single==null) {
			synchronized (Singleton_lh_03.class) {	
		if(single == null) {
			single =  new Singleton_lh_03();
		}
	
	}
}
		return single;
		
	}
}
