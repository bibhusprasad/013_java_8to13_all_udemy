package ex07.defalutAndStatic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class $01_DefaultsStaticExample {

	public static void main(final String[] args) {
		final List<String> names = Arrays.asList("Mike", "Syed", "Jenny", "Gene", "Rajeev");
		// Collections.sort(names);
		// System.out.println("names = " + names);

		names.sort(Comparator.naturalOrder());
		System.out.println("names = " + names);
		// OP: names = [Gene, Jenny, Mike, Rajeev, Syed]

	}
}
