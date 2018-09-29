package _01_Singleton;

public class _01_Singleton_lh_01 {
public static void main(String[] args) {
	Singleton_lh_01 singleton_lh_01 = Singleton_lh_01.getInstance();
	
}
}
 class Singleton_lh_01{
	 private Singleton_lh_01() {}
	 private static Singleton_lh_01 single = null;
	 public static Singleton_lh_01 getInstance() {
		 if(single == null) {
			 single = new Singleton_lh_01();
		 }
		 return single;
	 }
 }