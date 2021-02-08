package ex01.basic;

import java.util.List;

public class Instructor {
	String name;
	int yearOfExperience;
	String title;
	String gender;
	boolean onlineCourses;
	List<String> courses;

	public Instructor() {
	}

	public Instructor(final String name, final int yearOfExperience, final String title, final String gender,
			final boolean onlineCourses, final List<String> courses) {
		this.name = name;
		this.yearOfExperience = yearOfExperience;
		this.title = title;
		this.gender = gender;
		this.onlineCourses = onlineCourses;
		this.courses = courses;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getYearOfExperience() {
		return this.yearOfExperience;
	}

	public void setYearOfExperience(final int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(final String gender) {
		this.gender = gender;
	}

	public boolean isOnlineCourses() {
		return this.onlineCourses;
	}

	public void setOnlineCourses(final boolean onlineCourses) {
		this.onlineCourses = onlineCourses;
	}

	public List<String> getCourses() {
		return this.courses;
	}

	public void setCourses(final List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor{" + "name='" + this.name + '\'' + ", yearOfExperience=" + this.yearOfExperience + ", title='"
				+ this.title + '\'' + ", gender='" + this.gender + '\'' + ", onlineCourses=" + this.onlineCourses
				+ ", courses=" + this.courses + '}';
	}

}
