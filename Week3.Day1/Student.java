package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.deptName();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();

	}

	public void studentName() {
		System.out.println("Student name is Priyanka");
	}
	public void studentDept() {
		System.out.println("Student department is CS");
	}
	public void studentId() {
		System.out.println("Student ID is ST12345");
	}
}
