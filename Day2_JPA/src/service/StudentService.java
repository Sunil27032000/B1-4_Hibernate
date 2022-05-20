package service;

import entities.Student;

public interface StudentService {

	abstract void aadStudent(Student student);
	abstract Student findStudentById(int ID);
	abstract void updateStudent(Student student);
	abstract void removeStudent(Student student);

}
