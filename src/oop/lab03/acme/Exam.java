package oop.lab03.acme;

import java.util.Arrays;

public class Exam {

	private final int id;
	private int maxStudents;
	private int registeredStudents;
	private final String courseName;
	private final Professor professor;
	private final ExamRoom room;
	private final Student[] students;
	
	public Exam(int id, String courseName,int maxStudents, Professor professor, ExamRoom room) {
		this.id = id;
		this.maxStudents =maxStudents;
		this.registeredStudents = 0;
		this.courseName = courseName;
		this.professor = professor;
		this.room = room;
		this.students = new Student[maxStudents];
	}

	public int getId() {
		return id;
	}

	public int getRegisteredStudents() {
		return registeredStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public Professor getProfessor() {
		return professor;
	}

	public ExamRoom getRoom() {
		return room;
	}

	public Student[] getStudents() {
		return students;
	}
	
	public int getMaxStudents() {
		return maxStudents;
	}
	
	
	public void registerStudent(Student student) {
		if(maxStudents!=registeredStudents) {
			students[registeredStudents]= student;
			this.registeredStudents++;
			System.out.println("registered");
		}
		else {
			System.out.println("Error, Exam full");
		}
	}
	
	@Override
	public String toString() {
		return "Exam [id=" + id + ", maxStudents=" + maxStudents + ", registeredStudents=" + registeredStudents
				+ ", courseName=" + courseName + ", professor=" + professor + ", room=" + room + ", students="
				+ Arrays.toString(students) + "]";
	}

	
}
