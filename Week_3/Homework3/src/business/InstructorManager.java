package business;

import core.Logger;
import dataAccsess.InstructorDao;
import entities.Instructor;

public class InstructorManager {

	private InstructorDao ýnstructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao ýnstructorDao, Logger[] loggers) {
		
		this.ýnstructorDao=ýnstructorDao;
		this.loggers=loggers;	
	}
	
	public void add(Instructor ýnstructor)
	{
		System.out.println(ýnstructor.getFullName());
		ýnstructorDao.add(ýnstructor);
		

		 for(Logger logger:loggers) {
			   
			   logger.log(ýnstructor.getFullName());
			   	   
		   }

		
	}
	
	
	
	
}
