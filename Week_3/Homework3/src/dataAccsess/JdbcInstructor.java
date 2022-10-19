package dataAccsess;

import entities.Instructor;

public class JdbcInstructor implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
	
		System.out.println("Jdbc ile Veritabanýna Eklendi:"+instructor.getFullName());
	}



}
