package com.capg.studentrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.studentrestapi.exceptions.StudentNotFoundException;
import com.capg.studentrestapi.model.Student;
import com.capg.studentrestapi.repository.StudentJpaRepo;

@Service
public class StudentService {
	
	@Autowired(required = true)
	StudentJpaRepo repo;

	public List<Student> getListOfStudents(){
      	return repo.findAll();
	}
	public Student getStudent(String studentName) {
		if(!repo.existsById(studentName)) {
			throw new StudentNotFoundException("student with id : ["+studentName+"] Not Found"); 
		}
		return repo.getOne(studentName);
	}
	@Transactional
	public Student addStudent(Student student) {
		return repo.save(student);
	}	
	@Transactional
	public boolean deleteStudent(String studentName) {
		repo.deleteById(studentName);
		return !repo.existsById(studentName);
	}
	@Transactional
	public Student updateStudent(Student newStudentData) {
		Student student=repo.getOne(newStudentData.getStudentName());		
		student.setDob(newStudentData.getDob());
		student.setStudentName(newStudentData.getStudentName());
		repo.save(student);
		return student;

}
}
