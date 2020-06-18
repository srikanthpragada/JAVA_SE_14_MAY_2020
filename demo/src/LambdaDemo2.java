import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		var names = new ArrayList<String>();

		names.add("James");
		names.add("Anders");
		names.add("Li");
		names.add("Dennies");

		Collections.sort(names, new LengthCompare());

		for (String n : names)
			System.out.println(n);

		Collections.sort(names, (s1, s2) -> s1.length() - s2.length());

		for (String n : names)
			System.out.println(n);
	}

}
