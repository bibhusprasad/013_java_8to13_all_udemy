package ex04.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class $02_StreamVsCollectionsExample {

	public static void main(final String[] args) {

		final List<String> names = new ArrayList<>();
		names.add("Alok");
		names.add("Bibhu");
		names.add("Chita");
		System.out.println("\n1st Printer");
		System.out.println(names);
		// OP:
		// 1st Printer
		// [Alok, Bibhu, Chita]
		names.remove("Chita");
		System.out.println("\n2nd Printer");
		System.out.println(names);
		// OP:
		// 2nd Printer
		// [Alok, Bibhu]

		final Stream<String> nameStream = names.stream();
		System.out.println("\n3rd Printer");
		nameStream.forEach(System.out::println);
		// OP:
		// 3rd Printer
		// Alok
		// Bibhu
		System.out.println("\n4th Printer");
		// nameStream.forEach(System.out::println);

		// OP:
		// 4th Printer
		// Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed at
		// 		java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279) at
		// 		java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:658) at
		// 		ex04.stream.$02_StreamVsCollectionsExample.main($02_StreamVsCollectionsExample.java:31)

		System.out.println("\n5th Printer");
		names.stream().forEach(System.out::println);
		// OP:
		// 5th Printer
		// Alok
		// Bibhu

	}

}
