package oop.lab03.acme;

public class Professor implements User {
	
	private static final String DOT = ".";
	private final String name;
	private final String surname;
	private final int id;
	private String[] courses;
	private final String password;

	public Professor(String name, String surname, int id, String[] courses, String password) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.courses = courses;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getId() {
		return id;
	}

	public String[] getCourses() {
		return courses;
	}
	
	public void replaceCourse(String course, int index) {
		this.courses[index]= course;
	}
	
	public void replaceAllCourses(String[] courses) {
		this.courses=courses;
	}

	@Override
	public String getUsername() {
		return this.name;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getDescription() {
		return this.toString();
	}

}
