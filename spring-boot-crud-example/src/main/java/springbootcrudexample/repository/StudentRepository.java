package springbootcrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootcrudexample.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByfirstName(String name);
	Student findBylastName(String name);
}
