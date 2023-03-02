package springbootcrudexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootcrudexample.entity.Student;
import springbootcrudexample.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	 public Student saveStudent(Student student) {
	        return repository.save(student);
	    }
	 
	 public List<Student> saveStudents(List<Student> students) {
	        return repository.saveAll(students);
	    }

	    public List<Student> getStudent() {
	        return repository.findAll();
	    }

	    public Student getStudentById(int id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Student getStudentByfirstName(String name) {
	        return repository.findByfirstName(name);
	    }

	    public Student getStudentBylastName(String name) {
	        return repository.findBylastName(name);
	    }

	    public String deleteStudent(int id) {
	        repository.deleteById(id);
	        return "student removed !! " + id;
	    }

	    public Student updateStudent(Student student) {
	    	Student existingStudent = repository.findById(student.getId()).orElse(null);
	        existingStudent.setFirstName(student.getFirstName());
	        existingStudent.setLastName(student.getLastName());
	        existingStudent.setEmail(student.getEmail());
	        existingStudent.setAge(student.getAge());
	        return repository.save(existingStudent);
	    }


	}

