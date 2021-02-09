package ex03.functionalInterface.consumer;

import java.util.List;
import java.util.function.Consumer;

import ex01.basic.Instructor;
import ex01.basic.Instructors;

public class $02_ConsumerInstructorExample {

	public static void main(final String[] args) {
		final List<Instructor> instructorList = Instructors.getAll();

		System.out.println("\nPrint all the values of Instructor");
		final Consumer<Instructor> c1 = i -> System.out.println(i);
		for (final Instructor instructor : instructorList) {
			c1.accept(instructor);
		}
		// OP:
		// Print all the values of Instructor
		// Instructor{name='Mike', yearOfExperience=10, title='Software Developer',gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]}
		// Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]}
		// Instructor{name='Gene', yearOfExperience=6, title='Manager', gender='M', onlineCourses=false, courses=[C++ Programming, C Programming, React Native]}
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}
		// Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}

		System.out.println("\nPrint all the values of Instructor using forEach");
		instructorList.forEach(c1);
		// OP:
		// Print all the values of Instructor using forEach
		// Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]}
		// Instructor{name='Jenny', yearOfExperience=5, title='Engineer', gender='F', onlineCourses=false, courses=[Multi-Threaded Programming, CI/CD, Unit Testing]}
		// Instructor{name='Gene', yearOfExperience=6, title='Manager', gender='M', onlineCourses=false, courses=[C++ Programming, C Programming, React Native]}
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}
		// Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}

		System.out.println("\nPrint all the names of Instructor using forEach");
		final Consumer<Instructor> c2 = i -> System.out.println(i.getName());
		instructorList.forEach(c2);
		// OP:
		// Print all the names of Instructor using forEach
		// Mike
		// Jenny
		// Gene
		// Anthony
		// Syed

		System.out.println("\nPrint all the names and courses of Instructor using forEach");
		final Consumer<Instructor> c3 = i -> System.out.println(i.getCourses());
		instructorList.forEach(c2.andThen(c3));
		// OP:
		// Print all the names and courses of Instructor using forEach
		// Mike
		// [Java Programming, C++ Programming, Python Programming]
		// Jenny
		// [Multi-Threaded Programming, CI/CD, Unit Testing]
		// Gene
		// [C++ Programming, C Programming, React Native]
		// Anthony
		// [Java Programming, Angular Programming, React Native]
		// Syed
		// [Java Programming, Java Multi-Threaded Programming, React Native]

		System.out.println("\nPrint all the Instructor having more than 10 years of Experience using forEach");
		final Consumer<Instructor> c4 = i -> {
			if (i.getYearOfExperience() > 10) {
				c1.accept(i);
			}
		};
		instructorList.forEach(c4);
		// OP:
		// Print all the Instructor having more than 10 years of Experience using forEach
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}
		// Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}

		System.out.println(
				"\nPrint all the Instructor having more than 5 years of Experience and teaches course online using forEach");
		final Consumer<Instructor> c5 = i -> {
			if (i.getYearOfExperience() > 5 && i.isOnlineCourses()) {
				c1.accept(i);
			}
		};
		instructorList.forEach(c5);
		// OP:
		// Print all the Instructor having more than 5 years of Experience and teaches course online using forEach
		// Instructor{name='Mike', yearOfExperience=10, title='Software Developer', gender='M', onlineCourses=true, courses=[Java Programming, C++ Programming, Python Programming]}
		// Instructor{name='Anthony', yearOfExperience=15, title='Senior Developer', gender='M', onlineCourses=true, courses=[Java Programming, Angular Programming, React Native]}
		// Instructor{name='Syed', yearOfExperience=15, title='Principal Engineer', gender='M', onlineCourses=true, courses=[Java Programming, Java Multi-Threaded Programming, React Native]}

	}
}
