import java.util.List;
import java.util.ArrayList;

public class Ex6{
	public static <T> T get(List<T> list, T object) {
		if (list.contains(object))
			return object;
		return null;
	}

	public static void main(String[] args) {
		System.out.println("Ex6");
		List<String> list = new ArrayList<String>();
		list.add("x");

		System.out.println(get(list, "x"));
	}
}