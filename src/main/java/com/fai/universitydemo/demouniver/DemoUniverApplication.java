package com.fai.universitydemo.demouniver;

import com.fai.universitydemo.demouniver.dao.StudentDAO;
import com.fai.universitydemo.demouniver.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoUniverApplication {

	private final StudentDAO studentDAO;

	public static void main(String[] args) {
		SpringApplication.run(DemoUniverApplication.class, args);
	}

	public DemoUniverApplication(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return runner->{
			System.out.println("Start Project");
//			createStudent();
			getStudentById(1);
		};
	}
	public void createStudent(){
		Student student = new Student();
		student.first_name="na";
		student.last_name ="tra";
		student.Email="natra321@gmail.com";
		studentDAO.save(student);
	}
	public void getStudentById(Integer id)
	{
		Student student = studentDAO.getStudentById(id);
		System.out.println(student.toString()) ;
	}
}
