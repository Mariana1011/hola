package com.example.reto3.servicio;

import com.example.reto3.entidad.Category;
import com.example.reto3.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> getCategories(){
        return repository.findAll();
    }

    public Category saveCategory(Category category){
        return repository.save(category);
    }

    public Category getCategory(long id){
        return  repository.findById(id).orElse(null);
    }

    public void deleteCategory(long id){
        repository.deleteById(id);
    }

}
