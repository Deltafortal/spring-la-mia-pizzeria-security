package org.java.spring.serv;

import java.util.List;

import org.java.spring.pojo.Ingredient;
import org.java.spring.repo.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {

	
	@Autowired
	private IngredientRepository ingredientRepo;
	
	
	
	
	//Functions
	
	public List<Ingredient> findAll() {
		return ingredientRepo.findAll();
	}
	
	
	
	public Ingredient findById(int id) {
		return ingredientRepo.findById(id).get();
	}
	
	
	public void save(Ingredient ingredient) {
		ingredientRepo.save(ingredient);
	}
	
	public void delete(Ingredient ingredient) {
		
		ingredientRepo.delete(ingredient);
	}
}
