import java.util.Date;

public class Singleton {

	private static Singleton singletonInstance;

	private Date createdAt;

	private Singleton(Date createdAt) {
		this.createdAt = createdAt;
	}

	public static synchronized Singleton getInstance() {
		if (singletonInstance == null)
			singletonInstance = new Singleton(new Date());
		return singletonInstance;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}
}
