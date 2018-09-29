package _01_Singleton;

public class _01_Singleton_lh_02 {

}

class Singleton_lh_02{
	private Singleton_lh_02(){};
	
	private static Singleton_lh_02 single = null;
	private static synchronized Singleton_lh_02 getInstance() {
		if(single == null) {
			single = new Singleton_lh_02();
		}
		
		return single;
	}
}