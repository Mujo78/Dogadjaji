package com.example.dogadjaj181.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dogadjaj181.models.entities.Category;
import com.example.dogadjaj181.models.in.CategoryIn;
import com.example.dogadjaj181.models.out.CategoryOut;
import com.example.dogadjaj181.repository.CategoryRepository;
import com.example.dogadjaj181.services.CategoryService;

@Service
public class CategoryServicesImplementation implements CategoryService {


    @Autowired
    private CategoryRepository _CategoryRepository;

    @Override
    public List<CategoryOut> getAllCategories() {
        
        List<Category> kategorije = _CategoryRepository.findAll();
        List<CategoryOut> kategorijeOut = new ArrayList<>();

        for(Category categories : kategorije){
            kategorijeOut.add(new CategoryOut(categories));
        }
        return kategorijeOut;
    }

    @Override
    public CategoryOut addNewCategory(CategoryIn categoryIn) {
        Category categories = new Category(categoryIn);
        _CategoryRepository.save(categories);
        return new CategoryOut(categories);
    }

    @Override
    public CategoryOut edit(Integer id, CategoryIn catIn) {
        Category cat = _CategoryRepository.findById(id).get();
        if(cat != null){
            cat.setNameCategory(catIn.getNameCategory());
            cat.setUrlIkona(catIn.getUrlIkona());
            _CategoryRepository.save(cat);
            return new CategoryOut(cat);
        }
        return null;
    }
    
}
