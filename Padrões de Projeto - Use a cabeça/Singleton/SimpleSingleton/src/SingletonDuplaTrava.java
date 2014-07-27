import java.util.Date;

public class SingletonDuplaTrava {
	// JAVA 5
	private volatile static SingletonDuplaTrava singletonInstance;

	private Date createdAt;

	private SingletonDuplaTrava(Date createdAt) {
		this.createdAt = createdAt;
	}

	public static SingletonDuplaTrava getInstance() {
		if (singletonInstance == null) {
			synchronized (Singleton.class) {
				if (singletonInstance == null) {
					singletonInstance = new SingletonDuplaTrava(new Date());
				}
			}
		}
		
		return singletonInstance;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}
}
