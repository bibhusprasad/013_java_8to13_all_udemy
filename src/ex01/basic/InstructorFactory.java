package ex01.basic;

import java.util.List;

public interface InstructorFactory {

	public abstract Instructor getInstructor(final String name, final int yearOfExperience, final String title,
			final String gender, final boolean onlineCourses, final List<String> courses);
}
