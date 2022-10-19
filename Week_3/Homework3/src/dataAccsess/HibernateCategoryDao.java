package dataAccsess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		
		System.out.println("Hibernate ile Veritabanýna Eklendi:"+category.getCategoryName());
	}



}
