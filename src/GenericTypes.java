import java.util.ArrayList;
import java.util.List;

class GenericTypes1 {
	public static String method(List<String> list) {
		System.out.println("invoke method(List<String> list)");
		return "";
	}

	public static int method(List<Integer> list) {
		System.out.println("invoke method(List<Integer> list)");
		return 1;
	}
}

public class GenericTypes {
	public static void method(Object object) {
		System.out.println("Object");
	}

	public static void method(Double object) {
		System.out.println("Double");
	}

	public static void main(String[] args) {
		GenericTypes.method(null);
		// GenericTypes1.method(null); //error
		GenericTypes.method(new ArrayList<String>());
		GenericTypes.method(new ArrayList<Integer>());
	}
}
