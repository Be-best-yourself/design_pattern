package _01_Singleton;

//µ¥ÀýÄ£Ê½
public class _01_Singleton_eh {
 static Singleton singleton = Singleton.getInstance();
 public static void main(String[] args) {
	
	singleton.a = "2222";
	Singleton si = Singleton.getInstance();
	System.out.println(si.a);
}
}

class Singleton{
	public static String a = "11";
	private static byte[] bytes = new byte[100*88];
	private static final Singleton singleton = new Singleton();
	private Singleton() {}
	
	 public static Singleton getInstance(){
         return singleton;
     }
	
}
