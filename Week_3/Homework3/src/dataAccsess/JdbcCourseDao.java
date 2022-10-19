package dataAccsess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
	
	public void add(Course course) {
		
		System.out.println("Jdbc ile Veritabanýna Eklendi:"+course.getCourseName());
		
	}


}
