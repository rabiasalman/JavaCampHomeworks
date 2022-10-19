import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.Logger;
import core.MailLogger;
import dataAccsess.HibernateCategoryDao;
import dataAccsess.JdbcCourseDao;
import dataAccsess.JdbcInstructor;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		
		System.out.println("*****************Kategori*******************");
		Category category1=new Category(1, "Programlama");
		//Category category2=new Category(2, "Programlama");
		List<Category> categories=new ArrayList<Category>();
		

		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(), loggers,categories);
		categoryManager.add(category1);
		//categoryManager.add(category2);
	
		
		System.out.println("\n*****************Kurs**********************");
		
		
		Course course1=new Course(1, "(2022) Yazýlým Geliþtirici Kampý-JAVA", "Sektöre Yönelik Projeler Gelþtireceðiz", 0);
		Course course2=new Course(2, "(2022) Yazýlým Geliþtirici Kampý-JAVA", "Sektöre Yönelik Projeler Gelþtireceðiz", 0);
		List<Course> courses=new ArrayList<Course>();
		
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(), loggers,courses);
		courseManager.add(course1);
		courseManager.add(course2);
		
		
		
		System.out.println("\n*****************Eðitmen*******************");

		Instructor instructor1=new Instructor(1,"Engin Demiroð");
		Instructor instructor2=new Instructor(1,"Murat Yücedað ");
		
		InstructorManager ýnstructorManager=new InstructorManager(new JdbcInstructor(), loggers);
		ýnstructorManager.add(instructor1);
        //ýnstructorManager.add(instructor2);		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
