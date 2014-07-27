import java.util.Date;

public class SingletonStatic {

	private static SingletonStatic singletonInstance = new SingletonStatic(new Date());

	private Date createdAt;

	private SingletonStatic(Date createdAt) {
		this.createdAt = createdAt;
	}

	public static SingletonStatic getInstance() {
		return singletonInstance;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}
}
