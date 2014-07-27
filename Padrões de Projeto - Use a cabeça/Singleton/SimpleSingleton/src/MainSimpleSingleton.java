
public class MainSimpleSingleton {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getCreatedAt());
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2.getCreatedAt());
	}

}
